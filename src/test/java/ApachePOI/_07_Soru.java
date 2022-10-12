package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class _07_Soru {

    /* Bir önceki soruda kullanıcıdan bu sefer sütun numarası isteyiniz ve o sütundaki bütün bilgileri yazdırınız.


     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Column Number: " );
        int ss = sc.nextInt();
        FindString(ss);
    }

    static void FindString(int ColumnNumber) {

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

            if (row.getCell(ColumnNumber) != null && sheet.getRow(i).getPhysicalNumberOfCells()>ColumnNumber ) {

                System.out.println(sheet.getRow(i).getCell(ColumnNumber));
                System.out.println();
            }
        }

    }

}
