package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Verilen Exceldeki password bilgisini bir metoda aracılığı bularak yazdırınız,
 * yani metoda "password" kelimesi gönderilecek, dönen değr password un kendisi olacak.
 * src/test/java/ApachePOI/resources/LoginData.xlsx
 */
public class _05_GetASpecificData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Search BY: " );
        String ss = sc.nextLine();
        FindString(ss);
    }

    static void FindString(String find) {

        String path = "src/test/java/ApachePOI/resource/LoginData.xlsx";
        Workbook workbook=null;
        try {
            FileInputStream inputstream = new FileInputStream(path);
            workbook = WorkbookFactory.create(inputstream);

        }
      catch (IOException e) {
            throw new RuntimeException(e);
        }

        Sheet sheet = workbook.getSheet("Login");
        int rowCOunt = sheet.getPhysicalNumberOfRows();
        for (int i = 0; i < rowCOunt; i++) {
            Row row = sheet.getRow(i);
            Cell cell = row.getCell(0);
            if (cell.toString().equalsIgnoreCase(find)) {
                int cellCount = row.getPhysicalNumberOfCells();
                for (int j = 1; j < cellCount; j++) {

                    System.out.println( row.getCell(j)+" ");
                }
            }
            System.out.println();
        }


    }
}
