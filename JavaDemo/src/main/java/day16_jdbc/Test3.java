package day16_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the id of the student you want to delete:");
        String id = scanner.nextLine();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/school?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC",
                    "root","a123"
            );

            String sql = "delete from studentTb where s_id=?";
            PreparedStatement psta = conn.prepareStatement(sql);
            psta.setString(1,id);

            int row = psta.executeUpdate();
            if(row>0){
                System.out.println("delete successfully!");
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
