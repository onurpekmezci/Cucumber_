package _JDBC.Gun1;

import org.testng.annotations.Test;

import java.sql.*;

public class _01_Intro {

    @Test
    public void test1() throws SQLException {
        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila"; //hotname,port//db_adını
        String username = "root"; // username
        String password ="'\"-LhCB'.%k[4S]z"; // password

        Connection connection = DriverManager.getConnection(url,username,password);  // connection
        Statement statement = connection.createStatement(); // sorguları çalıştırmak için page açıldı

        ResultSet rs = statement.executeQuery("select * from actor");

        rs.next(); // 1. satır
        String firstname = rs.getString("first_name");
        String lastname=rs.getString("last_name");
        System.out.println("firstname :"+firstname+" lastname: "+lastname);

        rs.next(); // 2. satır
         firstname = rs.getString("first_name");
         lastname=rs.getString("last_name");
        System.out.println("firstname :"+firstname+" lastname: "+lastname);

        connection.close();

    }

}
