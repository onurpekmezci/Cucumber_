package _JDBC.Gun2;

import Utilities.ExcelUtility;
import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.SQLException;

public class _04_soru extends ExcelUtility {

    @Test
    public void writeactor() throws SQLException {

        String s="select * from actor";
      writeDBtoExcel( "src/test/java/ApachePOI/resource/dbwrite.xlsx",s);


    }
}
