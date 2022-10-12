package _JDBC.Gun1;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _04_Soru extends JDBCParent {

    //city tabloasundaki tüm kayıtları next ile yazdırınız.
    //city tablosundaki tüm kayıtları absolute ile yadırınız
    //city tablosundaki tüm kayıtları relative ile yazdırınız.

    @Test
    public void question1() throws SQLException {
        ResultSet rs = statement.executeQuery("select city,country from city left join country on city.country_id=country.country_id");

        while (rs.next()) {

            System.out.println("City :" + rs.getString("City") + " Country: " + rs.getString("Country"));

        }
    }

    @Test
    public void question2() throws SQLException {

        ResultSet rs = statement.executeQuery("select city,country from city left join country on city.country_id=country.country_id");

        int counter = 1;
        while (rs.absolute(counter)) {


            System.out.println("City :" + rs.getString("City") + " Country: " + rs.getString("Country"));
            counter++;
        }
        System.out.println(counter);
    }

    @Test
    public void question3() throws SQLException {


        ResultSet rs = statement.executeQuery("select city,country from city left join country on city.country_id=country.country_id");
        rs.last();
        int size = rs.getRow();
        rs.beforeFirst();

        rs.next();
        for (int i = 1; i < size; i++) {

            rs.relative(1);
            System.out.println("City :" + rs.getString("City") + " Country: " + rs.getString("Country"));


        }

//        int cnt=0;
//
//        while (rs.relative(1))
//        {
//
//            System.out.println(rs.getString(2)) ;
//        cnt++;
//
//
//        }

    }
}
