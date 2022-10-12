package ApachePOI;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _08_WirteInTheExcel {

    /// excele yazma
    public static void main(String[] args) throws IOException {
        String path ="src/test/java/ApachePOI/resource/WriteInTheExcelFile.xlsx";
        FileInputStream inputStream = new FileInputStream(path); // program ile dosya arasında bağlanıtı oluştu.
        Workbook workbook= WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheet("Sheet1");

        Row yenisatir=sheet.createRow(0);
        Cell yenihucre= yenisatir.createCell(0);
        yenihucre.setCellValue("Merhaba Dünya");

        for (int i = 1; i < 10; i++) {

            yenisatir.createCell(i).setCellValue(i);
        }

        inputStream.close();

        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
        System.out.println("işlem tamam.");
    }

}
