package day16_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the name,age,gender,class:");
        String name = scanner.nextLine();
        String age = scanner.nextLine();
        String gender = scanner.nextLine();
        String cls = scanner.nextLine();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/school?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC",
                    "root","a123"
            );

            String sql = "insert into studentTb values (null,?,?,?,?)";
            PreparedStatement psta = conn.prepareStatement(sql);
//            psta.setXxx(set up which ?  ,  set up with what value);
            psta.setString(1,name);
            psta.setString(2,age);
            psta.setString(3,gender);
            psta.setString(4,cls);

//            every value as long as the format is correct, you can deal with it as String
//            psta.setString(   , "18");
//            psta.setInt(   , 18);

            int row = psta.executeUpdate();
            if(row>0){
                System.out.println("insert successfully!");
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
