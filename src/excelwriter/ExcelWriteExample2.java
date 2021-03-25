package excelwriter;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWriteExample2 {
    public static String path = "../Practice/DataTest/PracticingCreatingExcelExample1.xlsx";

    public static void main(String[] args) {

        Object[][] items = {//by Using OBJECT- I am able to read both integer and String type
                {"itemId", "name", "color", "price", "quantity"},
                {102, "Apple", "Red", .34, 1},
                {103, "Chocolate bar", "Brown", 2.75,3},
                {104, "Spinach", "Green", 4.56,1},
                {105, "Cereal", "Silver", 2.35, 4},


        };
                write(path,"ShoppingCart",items);
    }

    public static void write(String FilePath, String sheetName, Object[][] data) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet(sheetName);
        System.out.println("Excel sheet is created!!");
        int rowNum = 0;
        for (Object[] rowField : data) {
            XSSFRow row = sheet.createRow(rowNum++);

            int columnNum = 0;
            for (Object columnField : rowField) {
                XSSFCell cell = row.createCell(columnNum++);

                if (columnField instanceof String) {
                    cell.setCellValue((String) columnField);
                } else if (columnField instanceof Integer) {
                    cell.setCellValue((Integer) columnField);
                } else if (columnField instanceof Double) {
                    cell.setCellValue((Double) columnField);
                }
            }

        }

        try {
            FileOutputStream outputStream = new FileOutputStream(FilePath);
            workbook.write(outputStream);
            workbook.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
