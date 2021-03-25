package excelreader;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcel {
    public static String file_Path = "../Practice/DataTest/CreatingAExcelFile.xlsx";
    public static void main(String[] args) throws IOException {
        read(file_Path,0);

    }
    public static void read(String filePath, int sheetIndex) throws IOException {
        FileInputStream input = new FileInputStream(filePath);
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
                        System.out.print("Sheet is empty");
                }
            }
            System.out.println();

        }
        input.close();





    }













}
