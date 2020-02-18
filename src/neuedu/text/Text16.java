package neuedu.text;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Text16 {
    public static void main(String[] args) {
        String url="jdbc:mysql://192.168.234.128:3306/wyh?useUnicode=true&characterEncoding=utf8";
        String username="root";
        String password="123456";
        Connection con=null;
        PreparedStatement prepareStatement=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");//加载驱动类
            con = DriverManager.getConnection(url,username,password);
            prepareStatement= con.prepareStatement("insert into anlimal(name,age,sex) value('老鼠',1,1)");
            int i = prepareStatement.executeUpdate();
            System.out.println(i);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(prepareStatement!=null)
                    prepareStatement.close();
                if(con!=null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
