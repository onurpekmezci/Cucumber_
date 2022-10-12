package _JDBC.Gun2;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _01_SqlExample extends JDBCParent {
    //last//first//getrow //getint /// getdouble
    @Test
    public void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select city_id,city,country_id from city;");

        rs.last();
        System.out.println(rs.getString(1));

        int id=rs.getInt(1);
        System.out.println("idint : "+id);

        String name =rs.getString(2);
        System.out.println(name);


// tipi uygun olan dönüşümle , mesela hepsini string alabilirsin, ancak stringi int olarak alamazsın
//        int id2=rs.getInt(2);
//        System.out.println("idint : "+id);

rs.first(); // ilk satıra gider

int satirsayisi = rs.getRow();

    }
}
