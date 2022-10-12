package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _10_soru {

    /*  Soru 1:
     *  Çarpım tablosunu excele yazdırınız.
     *  1 x 1 = 1 şeklinde işaretleri de yazdırınız.
     *  sıfırdan excel oluşturarak.
     *  her bir onluktan sonra 1 satır boşluk bırakarak alt alata
     */

    /*  Soru 2:
     *  Çarpım tablosunu excele yazdırınız.
     *  1 x 1 = 1 şeklinde işaretleri de yazdırınız.
     *  sıfırdan excel oluşturarak.
     *  her bir onluktan sonra 1 kolon boşluk bırakarak yan yana
     */

    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("onurdeneme3");

        int counter = 0;
        int counter2=1;
        for (int i = 0; i < 10; i++) {
            Row row = sheet.createRow(i);
            for (int j = 1; j < 11; j++) {

                row.createCell(counter++).setCellValue(j);
                row.createCell(counter++).setCellValue("*");
                row.createCell(counter++).setCellValue(counter2 );
                row.createCell(counter++).setCellValue("=");
                row.createCell(counter++).setCellValue(j  * counter2);
                counter++;
            }
            counter=0;
            counter2++;
        }

        String path = "src/test/java/ApachePOI/resource/oo.xlsx";

        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();


    }


}
