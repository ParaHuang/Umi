package day16_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the id of the student you want to modify:");
        String id = scanner.nextLine();
        System.out.println("please enter the new name,age,gender,class:");
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

            String sql = "update studentTb set s_name=?,s_age=?,s_class=?,s_gender=? where s_id=?";
            PreparedStatement psta = conn.prepareStatement(sql);
            psta.setString(1,name);
            psta.setString(2,age);
            psta.setString(3,cls);
            psta.setString(4,gender);
            psta.setString(5,id);


            int row = psta.executeUpdate();
            if(row>0){
                System.out.println("modify successfully!");
            }else{
                System.out.println("this student doesn't exist");
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
