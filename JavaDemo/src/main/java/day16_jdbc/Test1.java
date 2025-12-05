package day16_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//jdbc:java database connectivity
public class Test1 {
    public static void main(String[] args) {
        // gold mine
        try {
            //1.get permission
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.build the connection
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/school?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC"
                    ,"root","a123");
//            url:
//            (1)protocol:             jdbc:mysql://               ,       http://       ,         ftp://
//            (2)ip address:           172.45,27.18            ,   domain          ,machine name     ,  localhost
//            (3)port:             3306->mysql database,       8080->tomcat server
//            (4)database name
//            (5)after ? ,   parameters are the configuration for this connection
            //3.operations of dml
//            insert , delete , update , select
            String sql = "insert into studentTb values (null,'Lucy',17,'f','A8')";  //->command
            PreparedStatement psta = conn.prepareStatement(sql);   //->tool based on command

            //4.execute the operation
            //returns the affected rows
            int row = psta.executeUpdate();     //insert,delete , update
            //
//            psta.executeQuery()       //select
            if(row>0){
                System.out.println("insert new student successfully!!");
            }

            //realease the resource
            psta.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
