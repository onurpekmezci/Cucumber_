package _JDBC.Gun2;

import Utilities.ExcelUtility;
import org.testng.annotations.Test;

import java.sql.SQLException;
import java.util.ArrayList;

public class _05_soru extends ExcelUtility {

    @Test
    public  void ExcelToDB() throws SQLException {

        ArrayList<ArrayList<String>> exceldata= getListData("src/test/java/ApachePOI/resource/dummy.xlsx","sheet1",4);

        for (int i = 1; i < exceldata.size(); i++) {

            String sql = "INSERT INTO deneme1 VALUES ('"+exceldata.get(i).get(0) +"','"+exceldata.get(i).get(1)+"', '"+exceldata.get(i).get(2)+"', '"+exceldata.get(i).get(3)+"')";
            statement.executeUpdate(sql);
        }
    }


}
