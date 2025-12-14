package day16_jdbc;

import java.sql.*;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/school?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC",
                    "root","a123"
            );

            String sql = "select * from studentTb";
            PreparedStatement psta = conn.prepareStatement(sql);

            ResultSet rs = psta.executeQuery();
            //1.move rs to the next row
//            rs.next();
            //2.get certain column from current row
            //xxx :depends on the type of the data you want to get
            //column: columnName or columnIndex
//            rs.getXxc(column)
//            int id = rs.getInt("s_id");
//            String name = rs.getString(2);
//            int age = rs.getInt("s_age");
//            String gender = rs.getString("s_gender");
//            String cls = rs.getString(5);
//            System.out.println(id+"--"+name+"--"+age+"--"+gender+"--"+cls);

            while(rs.next()) {
                System.out.println(rs.getInt("s_id") + "--" + rs.getString(2)
                        + "--" + rs.getInt("s_age") + "--" + rs.getString("s_gender")
                        + "--" + rs.getString(5));

            }


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
