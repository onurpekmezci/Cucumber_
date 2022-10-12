package _JDBC.Gun1;

import _JDBC.JDBCParent;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.*;

public class _02_BeforeAfter extends JDBCParent {

    private static Connection connection;
    private static Statement statement;
    @BeforeTest
    public void DBConnectionOpen() throws SQLException {

        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila"; //hotname,port//db_adını
        String username = "root"; // username
        String password = "'\"-LhCB'.%k[4S]z"; // password

        try {
            connection = DriverManager.getConnection(url, username, password);  // connection
            statement = connection.createStatement(); // sorguları çalıştırmak için page açıldı

        } catch (SQLException e) {
            throw new RuntimeException(e);


        }


    }

    @AfterTest
    public void DBConnectionClose() {

        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void Test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from language");

        rs.next();

        String Diladi =rs.getString("name");
        System.out.println("Dil Adı: "+Diladi);

         rs.next();
         Diladi =rs.getString("name");
        System.out.println("Dil Adı: "+Diladi);

        rs.next();
        Diladi =rs.getString("name");
        System.out.println("Dil Adı: "+Diladi);
    }

    @Test
    public void Test2() throws SQLException {

        ResultSet rs = statement.executeQuery("select * from language");

        rs.next();

        String Diladi =rs.getString(2);
        System.out.println("Dil Adı: "+Diladi);

        rs.next();
        Diladi =rs.getString(2);
        System.out.println("Dil Adı: "+Diladi);

        rs.next();
        Diladi =rs.getString(2);
        System.out.println("Dil Adı: "+Diladi);
    }

    @Test
    public void Test3() throws SQLException {

        ResultSet rs = statement.executeQuery("select * from language");

        rs.next();

        String Diladi =rs.getString(2);
        System.out.println("Dil Adı: "+Diladi);

        rs.next();
        Diladi =rs.getString(2);
        System.out.println("Dil Adı: "+Diladi);

        rs.previous();
        Diladi =rs.getString(2);
        System.out.println("Dil Adı: "+Diladi);
    }

}
