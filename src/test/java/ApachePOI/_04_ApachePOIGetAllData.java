package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _04_ApachePOIGetAllData {


    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";
        FileInputStream InputStream = new FileInputStream(path); // program ile dosya arasında bağlanıtı oluştu.
        Workbook WorkbookFile = WorkbookFactory.create(InputStream);
        Sheet sheet = WorkbookFile.getSheet("Sheet1");


        int rowCount = sheet.getPhysicalNumberOfRows();
        for (int i = 0; i < rowCount; i++) {
            Row row = sheet.getRow(i);
            int cellCount = row.getPhysicalNumberOfCells();
            for (int j = 0; j < cellCount; j++) {

                Cell cell = row.getCell(j);
                System.out.print(cell+"\t");


            }
            System.out.println();
        }

    }
}
