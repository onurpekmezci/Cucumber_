package _JDBC.Gun1;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_AbsoluteRelative extends JDBCParent {

    //Abslute baştan itibaren ilerler
    //RElative bulunduğu yerden itibaren ilerler

    @Test
    public void test1() throws SQLException {

        //next(): bir sonraki
        //previous(): bir önceki row
        //absoulute(4): baştan itibaren 4. rowa gider
        //relative(4): bulunduğu satırdan dört row sonraki kayda gider


        ResultSet rs = statement.executeQuery("select * from film");
        rs.absolute(10);
        System.out.println(rs.getString("title"));

        rs.absolute(15);
        System.out.println(rs.getString("title"));

        rs.absolute(-15); // sondan 15
        System.out.println(rs.getString("title"));


        rs.relative(5); // bulunduğun yerden 5 adım ileri
        System.out.println(rs.getString("title"));

        rs.relative(-5); // bulunduğun yerden 5 adım geri
        System.out.println(rs.getString("title"));
    }
}
