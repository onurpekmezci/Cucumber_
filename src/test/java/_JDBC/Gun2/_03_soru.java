package _JDBC.Gun2;

import _JDBC.JDBCParent;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _03_soru extends JDBCParent {

    @Parameters("query")
    @Test
    public void gettable(String query) throws SQLException {


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
