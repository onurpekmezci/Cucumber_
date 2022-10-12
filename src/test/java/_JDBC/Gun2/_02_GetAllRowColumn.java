package _JDBC.Gun2;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _02_GetAllRowColumn extends JDBCParent {

    @Test
    public void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from language");
        ResultSetMetaData rsmd = rs.getMetaData();
        int coulmnCount = rsmd.getColumnCount();
        for (int i = 1; i <= coulmnCount; i++) {

            String columnname = rsmd.getColumnName(i);
            String columnType = rsmd.getColumnTypeName(i);

            System.out.println(columnType + " " + columnname);
        }
    }


    @Test
    public void test2() throws SQLException {

        // language tablosundaki tüm satırları ve tüm sütunları yazdırınız,
        // aynı mysql sonuç ekranında olduğu gibi

        ResultSet rs = statement.executeQuery("select * from language");

        ResultSetMetaData rsmd = rs.getMetaData();
        int coulmnCount = rsmd.getColumnCount();

        for (int i = 1; i <= coulmnCount; i++) {

            String columnname = rsmd.getColumnName(i);
            System.out.print(columnname + " ");
        }
        System.out.println();

//        while (rs.next())
//        {
//            System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)) ;
//
//        }


        while (rs.next()) {
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                System.out.print(rs.getString(i));

            }
            System.out.println();
        }

    }

    @Test
    public void test3() throws SQLException {
        // formatlı
        // language tablosundaki tüm satırları ve tüm sütunları yazdırınız,
        // aynı mysql sonuç ekranında olduğu gibi


        // % değişkenin değerini ifade eder
        //- sola dayalı yazdırır
        // 20 her zaman kaç hane kullansın
        // s string değerler için , sayısal değerler için d kullanılır
        // "%5.2d" 5 hane kullan 2 hanesini decimal kullan
        ResultSet rs = statement.executeQuery("select * from language");

        ResultSetMetaData rsmd = rs.getMetaData();
        int coulmnCount = rsmd.getColumnCount();

        for (int i = 1; i <= coulmnCount; i++) {

            String columnname = rsmd.getColumnName(i);
            System.out.printf("%-20s",columnname);
        }
        System.out.println();

        while (rs.next()) {
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                System.out.printf("%-20s",rs.getString(i));

            }
            System.out.println();
        }

    }


    @Test
    public void test4() throws SQLException {
        // actor tablosundaki tüm satırları ve tüm sütunları yazdırınız, aynı mysql sonuç ekranında olduğu gibi
        // fakat metod kullanınız, metoda sorguyu gönderiniz ve orada yazdırınız.
        //getTable("select * from actor");

        gettable("select * from actor");
    }

    private void gettable(String query) throws SQLException {


        ResultSet rs = statement.executeQuery(query);
        ResultSetMetaData rsmd = rs.getMetaData();
        int coulmnCount = rsmd.getColumnCount();

        for (int i = 1; i <= coulmnCount; i++) {

            String columnname = rsmd.getColumnName(i);
            System.out.printf("%-20s",columnname);
        }
        System.out.println();

        while (rs.next()) {
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                System.out.printf("%-20s",rs.getString(i));

            }
            System.out.println();
        }

    }




}
