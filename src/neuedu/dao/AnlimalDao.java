package neuedu.dao;

import neuedu.pojo.Anlimal;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AnlimalDao implements IanlimalDao {
    String url="jdbc:mysql://192.168.234.128:3306/wyh?useUnicode=true&characterEncoding=utf8";
    String username="root";
    String password="123456";
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    @Override
    public List<Anlimal> querry() {
        List<Anlimal> list = new ArrayList<>();
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //创建链接
            connection = DriverManager.getConnection(url,username,password);
            //创建命令行，写sql语句
            preparedStatement = connection.prepareStatement("select id,name,age,sex from anlimal");
            //执行sql语句
            //如果是查询，调用executeQuery()方法，返回一个ResultSet结果集
            resultSet = preparedStatement.executeQuery();
            /**
             * ResultSet 每次调用next()方法的时候，会做两件事
             *  1.看有没有下一行，如果没有返回false
             *  2.如果有 将游标推向下一行  返回true
             */
            while (resultSet.next()){
                Anlimal anlimal = new Anlimal();
                //读到的数据，封装到对象中
                anlimal.setId(resultSet.getInt("id"));
                anlimal.setAge(resultSet.getInt("age"));
                anlimal.setName(resultSet.getString("name"));
                anlimal.setSex(resultSet.getInt("sex"));
                list.add(anlimal);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement!=null){
                    preparedStatement.close();
                }
                if (connection!=null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return list;
    }

    @Override
    public int add(Anlimal anlimal) {
        int i = 0;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //创建链接
            connection = DriverManager.getConnection(url,username,password);
            //创建命令行，写sql语句
            preparedStatement = connection.prepareStatement("insert into anlimal(name,age,sex)values(?,?,?)");
            //执行sql语句
            preparedStatement.setString(1,anlimal.getName());//1代表给第一个传值
            preparedStatement.setInt(2,anlimal.getAge());
            preparedStatement.setInt(3,anlimal.getSex());

            i = preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement!=null){
                    preparedStatement.close();
                }
                if (connection!=null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    @Override
    public int update(Anlimal anlimal) {
        int i = 0;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //创建链接
            connection = DriverManager.getConnection(url,username,password);
            //创建命令行，写sql语句
            preparedStatement = connection.prepareStatement("update anlimal set name=?,age=?,sex=? where id=?");
//            where id=?  条件
            //执行sql语句
            preparedStatement.setString(1,anlimal.getName());//1代表给第一个传值
            preparedStatement.setInt(2,anlimal.getAge());
            preparedStatement.setInt(3,anlimal.getSex());
            preparedStatement.setInt(4,anlimal.getId());
            i = preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement!=null){
                    preparedStatement.close();
                }
                if (connection!=null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    @Override
    public int del(int id) {
        int i = 0;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //创建链接
            connection = DriverManager.getConnection(url,username,password);
            //创建命令行，写sql语句
            preparedStatement = connection.prepareStatement("delete from anlimal where id=?");
//            where id=?  条件
            //执行sql语句
            preparedStatement.setInt(1,id);//1代表给第一个传值
            i = preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement!=null){
                    preparedStatement.close();
                }
                if (connection!=null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    @Override
    public Anlimal querry(int id) {
        return null;
    }
}
