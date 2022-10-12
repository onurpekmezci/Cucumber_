package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;

public class _09_NewExcelWrite {
    public static void main(String[] args) throws IOException {


        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("onurdeneme");

        Row yenisatir=sheet.createRow(0);
        Cell yenihucre= yenisatir.createCell(0);
        yenihucre.setCellValue("Merhaba Dünya");

        for (int i = 1; i < 10; i++) {

            yenisatir.createCell(i).setCellValue(i);
        }

        String path ="src/test/java/ApachePOI/resource/OnurNewExcel.xlsx";

        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
        System.out.println("işlem tamam.");
    }

    }

