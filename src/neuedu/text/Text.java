package neuedu.text;

import neuedu.pojo.Anlimal;
import neuedu.pojo.Dept;
import neuedu.util.JdbcUtil;
import neuedu.util.MyArry;
import neuedu.util.RowMap;
import neuedu.web.AnlimalWeb;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Text {
    public static void main(String[] args) {
       /* Dog d1 = new Dog();
        d1.setAge(25);
        d1.setSex('n');
        int age = d1.getAge();
        char sex = d1.getSex();
        System.out.println(age);
        System.out.println(sex);*/
        /*long a = 10;
        long b = 20;
        long c = a+b;
        System.out.println(c);*/
        /*int year = 1990;
        if((year%4==0&&year%100!=0)||(year%400==0)){
            System.out.println("是闰年");
        }else {
            System.out.println("不是闰年");
        }*/
        /*int i=1;
        int sum=0;
        while(i<=100){
            sum = sum+i;
            i++;
        }
        System.out.println(sum);
        for (i=1;i<=100;i++){
            sum=sum+i;
        }
        System.out.println(sum);*/
        /**
         * 分层开发
         * */
     /*   AnlimalWeb anlimalWeb = new AnlimalWeb();
        anlimalWeb.showmain();
        anlimalWeb.input();*/
        /**
         * 动态参数
         * int arry[]={1,2,3,4,5,6,7};
         * System.out.println(JdbcUtil.add(arry));
         * */
        /*
        * 自定义泛型
        * MyArry<Integer> myArry= new MyArry();
          myArry.add();
        * class类也是泛型类
        * */
        /**
         * 类在第一次使用的时候  会把class加载到  我们内存的方法区中
         * 并且在堆区中创建一个Class对象   指向到该方法区
         * 反射    就是  我们要获取的  那个Class类型的对象
         * 获取该对象的方法
         *         1.类名.class
         *              Class clz = Animal.class;
         *         2.对象名.getClass()
         *              nimal animal =new Animal();
         *             Class clz2 = animal.getClass();
         *         3.Class.forName("类的完全限定名")
         *              Class clz3 = Class.forName("neuedu.pojo.Anlimal");
         * */
        /*
        * 类下 每一个方法都会封装成  Method类型的对象
        * 类下 每一个属性都会封装成  Field类型的对象
        * 有多少个属性就有多少个Field，有多少个方法就有多少个Method
        * 实际上Field 和 Method 是数组
        *   Class clz = Animal.class;
        Field[] fields = clz.getDeclaredFields();
        for (Field f:fields){
            System.out.println(f.getName());
        }
        * */
       //调用 该类的无参构造，创建一个对象 clz.newInstance();
//        List<Anlimal> list = JdbcUtil.executeQuerry("select id,name,age,sex from anlimal",Anlimal.class);
        Class clz = Anlimal.class;
        /**
         * 注解：
         * 在反射过程中
         * 为了让 类 属性 方法 等实现某种特定功能 而诞生的
         * 写法：@注解名(注解值) 注解值可以有一个或多个
         * 如何定义一个注解     注解就是  @接口
         *
         * */
       /* 方法一

        List<Dept> list = JdbcUtil.executeQuerry("select deptno,dname,loc from dept", Dept.class);
        System.out.println(list);*/
       //方法二
        //传接口-接口实现类-匿名内部类
     /*   List<Dept> list = JdbcUtil.exectueQuerry("select deptno,dname,loc from dept", new RowMap<Dept>() {
            //new 接口  要直接实现接口里的方法
            @Override
            public Dept rowMaping(ResultSet resultSet) {
                //查那个表，就创建那个对象
                Dept dept = new Dept();
                try {
                    dept.setDeptno(resultSet.getInt("deptno"));
                    dept.setDname(resultSet.getString("dname"));
                    dept.setLocl(resultSet.getString("loc"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return dept;
            }
        });*/
//            lambda表达式写法
            List<Dept> list = JdbcUtil.exectueQuerry("select deptno,dname,loc from dept", (resultSet)-> {
                Dept dept = new Dept();
                try {
                    dept.setDeptno(resultSet.getInt("deptno"));
                    dept.setDname(resultSet.getString("dname"));
                    dept.setLocl(resultSet.getString("loc"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return dept;
        });
        System.out.println(list);
    }

}
