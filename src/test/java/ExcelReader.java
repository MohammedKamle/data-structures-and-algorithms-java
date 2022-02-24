import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReader {

    public static void main(String[] args) throws IOException {
        FileInputStream fs = new FileInputStream("src/test/java/test-data/sample.xls");

        //Creating a workbook

        HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(new File("src/test/java/test-data/sample.xls")));
        HSSFSheet sheet = workbook.getSheetAt(0);


//                for (int i=0; i<sheet.getRow(1).getLastCellNum(); i++){
//                    System.out.println(sheet.getRow(1).getCell(i));
//                }

        for (int j=0; j<sheet.getLastRowNum(); j++){
            for (int i=0; i<sheet.getRow(j).getLastCellNum(); i++){
                System.out.println(sheet.getRow(j).getCell(i));

            }
            System.out.println("//////////////////////////////////");
        }


        }



    }


