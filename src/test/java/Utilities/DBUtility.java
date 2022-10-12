package Utilities;

import com.mongodb.DBCollection;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtility {

    private static Connection connection;
    private static Statement statement;

    private static void DBConnectionOpen() {

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


    private static void DBConnectionClose() {

        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static List<List<String>> getListData(String sorgu) {

        List<List<String>> table = new ArrayList<>();
        DBConnectionOpen();
        try {
            ResultSet rs = statement.executeQuery(sorgu);

            int columnCount =  rs.getMetaData().getColumnCount();

            while (rs.next()) {
                List<String> satir = new ArrayList<>();
                for (int i = 1; i <= columnCount; i++) {
                  satir.add(rs.getString(i));
                }
                table.add(satir);
            }
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        DBConnectionClose();

        return table;
    }



    // kontrol
    public static void main(String[] args) {
        List<List<String>> table = getListData("select * from actor");

        for (List<String> item: table
             ) {
            System.out.println(item);
        }

    }
}
