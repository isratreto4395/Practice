package excelreader;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReadAllInputExample3 {

    public static String path = "../Practice/DataTest/PracticingCreating.xlsx";

    public static void main(String[] args) {
        reading(path,0);

    }

    public static void reading(String FilePath, int sheetIndex){
        try {
            FileInputStream input = new FileInputStream(FilePath);
            Workbook workbook = new XSSFWorkbook(input);
            Sheet sheet = workbook.getSheetAt(sheetIndex);
            for(Row row : sheet){
                for(Cell cell : row){
                    switch(cell.getCellType()){
                        case NUMERIC:
                            System.out.print((int)(cell.getNumericCellValue())+"\t");
                            break;
                        case STRING:
                            System.out.print(cell.getStringCellValue()+"\t");
                            break;
                        case BLANK:
                            System.out.print("It is empty"+"\t");
                    }
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }























}
