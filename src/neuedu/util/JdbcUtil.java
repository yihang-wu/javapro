package neuedu.util;

import neuedu.pojo.Anlimal;
import neuedu.pojo.Dept;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcUtil {
//    final 只读     规范用大写 URL
    private static final String url="jdbc:mysql://192.168.234.128:3306/wyh?useUnicode=true&characterEncoding=utf8";
    private static final String name="root";
    private static final String password="123456";
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    static Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url,name,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    //封装通用的增删改    返回值是int 受影响的行数
    //不确定个数，用集合或数组
    //如果没有占位符，传  null
    //Object...动态参数 ，调用的时候可以简化
    public static int executeUpdate(String sql,Object... params){
        int result = 0;
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;
        try {
            //sql语句是不确定的，所以传进来
            preparedStatement= connection.prepareStatement(sql);
            if(params!=null){
                //循环把？放进去
                for(int i=0;i<params.length;i++){
                    preparedStatement.setObject(i+1,params[i]);
                }
            }
            result = preparedStatement.executeUpdate();//执行结果
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {

        }
        return result;
    }
    //封装通用查询
    //static方法不用new，所以不写在类上
    //Class<T> clz传的是什么，List<T>就是什么类型
    public static <T> List<T> executeQuerry(String sql,Class<T> clz,Object...params){
        /*
         * anlimal继承Object
         * List<Anlimal>不继承List<Object>
         * */
        List<T> list =new ArrayList<>();
        //获取上边 connection = DriverManager.getConnection(url,name,password);
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            if(params != null){
                for (int i=0;i<params.length;i++){
                    preparedStatement.setObject(i+1,params[i]);
                }
            }
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                //.next()一行一行循环，一行一行赋值
                //创建一个T类型的对象
                //通过反射class对象 调用 无参构造 创建对象
                T t = clz.newInstance();
                //通过字段名从resultSet中拿值  然后赋值给 对象的属性
                //在不知道该类有多少属性的情况下  有多少属性 就set多少个属性
                //必须先获取有多少属性
                Field[] fields = clz.getDeclaredFields();//获取属性的集合
                for (Field f:fields){
                    //属性名 刚好和数据库字段名一样
                    //可以把属性名 当作数据库字段名  用resultSet.getObject(属性名)
                    //f.getName()可能和数据库中的字段名不一样
                    //先看该属性有没有Column注解 如果有用注解的名当作字段名
                    //如果没有 再把f.getName()当作字段名
                    //代码   先判断该属性是否有Colum注解
                    String colum = f.getName();
                    if (f.isAnnotationPresent(Colum.class)){
                        //如果有，用注解中的值替换
                        //获取注解
                        Colum c =f.getAnnotation(Colum.class);
                        //用注解的value 替换colum
                        colum = c.value();
                    }
                    Object value = resultSet.getObject(colum);
//                    Object value = resultSet.getObject(f.getName());
                    //拿出值
//                    System.out.println(value);
                    //为属性赋值 属性对象是Field 但是我们必须指明 我们要为哪个对象的属性赋值
                    /*
                    * 用field调用set方法 可以进行赋值
                    *   第一个参数 传一个对象 表示为哪个对象的属性赋值
                    *   第二个参数 传值 表示赋什么样的值
                    *   如果属性是 private 那么赋值之前必须打开权限
                    * */
                    f.setAccessible(true);
                    f.set(t,value);
                    //输出属性名System.out.println(f.getName());
                }
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }finally {
            close(connection,preparedStatement,resultSet);
        }
        return list;
    }
    //封装通用查询方法二  List的泛型是什么类型 就放一个什么类型的对象
    public static <T>List<T> exectueQuerry(String sql,RowMap<T> rowMap,Object...params){
        List<T> list = new ArrayList<>();
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            if (params!=null){
                for (int i=0;i<params.length;i++){
                    preparedStatement.setObject(i+1,params[i]);
                }
            }
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                //不同的表对resultSet的处理方式不同
                //对象不同，属性值不同
                //不同的表，不同的对象，用ResultSet 赋不同的值
                //就是把对 resultSet的处理方式（代码块）作为参数传递
                // rowMap.rowMaping(resultSet);返回的就是  T  所以用 T接收
               T t = rowMap.rowMaping(resultSet);
               list.add(t);
               /*
                伪代码
                Anlimal anlimal = new Anlimal();
                anlimal.setId(resultSet.getInt("id"));
                list.add(anlimal);*/
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(connection,preparedStatement,resultSet);
        }
        return list;
    }
    //增删改查都需要关闭，所以  封装关闭方法
    static void close(Connection connection,PreparedStatement preparedStatement){
        try {
            if (preparedStatement != null)
                preparedStatement.close();
            if (connection != null)
                connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //重载
    static void close(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet){
        try {
            if (resultSet != null)
                resultSet.close();
            close(connection,preparedStatement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * 动态参数
     *  public static int add(int... arry){
     *         int sum= 0 ;
     *         for (int a:arry){
     *             sum+=a;
     *         }
     *         return sum;
     *     }
     * */

}
