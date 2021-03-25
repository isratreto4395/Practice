package excelwriter;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreatingExcelWithIntegerAndStringValues {
    public static String file_Path = "../Practice/DataTest/PracticingCreating.xlsx";
    public static void main(String[] args) throws IOException {
        Object[][] TutoringSquad = {//by Using OBJECT- I am able to read both integer and String type
                {"stId", "stFirst_Name", "stLastName", "stAge"},
                {102, "Aleign", "Negash", 6},
                {103, "Easha", "Khanam", 2},
                {104, "Simar", "Kaur", 4},
                {105, "Nafiz", "Islam", 1},
                {106, "Israt", "Reto", 5}

        };

        creating_Excel(file_Path,"students",TutoringSquad);
    }

    public static void creating_Excel(String filePath, String sheetName, Object [][] data) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet(sheetName);
        System.out.println("Excel sheet is created!!");
        int rowNum = 0;
        for(Object[] r : data){
            // for(datatype item : array): my datatype- Object[], r is my array I am creating using data, data is my array that i am passing in my parameters
            XSSFRow row = sheet.createRow(rowNum++);

            int cellNum = 0;
            for(Object c : r){// I am using the r array i created above to create my cell array
                XSSFCell cell = row.createCell(cellNum++);
                if(c instanceof String){// so if my type variable is String
                    cell.setCellValue((String)c); //then set my cell to be read as string

                }else if(c instanceof Integer){
                    cell.setCellValue((Integer)c);


                }
            }
        }

        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);
        workbook.close();
    }





}
