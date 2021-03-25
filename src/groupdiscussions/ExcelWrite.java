package groupdiscussions;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWrite {

    public static String path = "../Practice/DataTest/Group_DiscussionFile.xlsx";

    public static void main(String[] args) throws IOException {
        Object[][] shirt = {
                {"shirtId", "shirtColor", "shirtSize", "NumericalSize","shirtPrice"},
                {102, "Blue", "M", 40,10.45},
                {103, "Purple", "L", 42,7.87},
                {104, "Pink", "XL", 44,6.66},
                {105, "Black", "XXL", 46,5.56},
                {106, "Yellow", "S", 38,9.88}
        };

        write(path,"guide",shirt);



    }

    public static void write(String filePath, String sheetName, Object[][] anyArray) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet(sheetName);
        System.out.println("Excel sheet is created");
        int rownum = 0;
        for(Object [] rw : anyArray ){
            Row row = sheet.createRow(rownum++);

        int columnNum = 0;
        for(Object cel : rw){
            Cell cell = row.createCell(columnNum++);

            if(cel instanceof String){
                cell.setCellValue((String)cel);
            }else if(cel instanceof Integer){
                cell.setCellValue((Integer)cel);
            }else if(cel instanceof Double){
                cell.setCellValue((Double)cel);
            }


        }

//            try {
//                FileOutputStream outputStream = new FileOutputStream(filePath);
//                workbook.write(outputStream);
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//

        }

        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);
        workbook.close();

    }




}
