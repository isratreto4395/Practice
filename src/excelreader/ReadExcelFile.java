package excelreader;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcelFile {
    public static void main(String[] args) throws IOException {


        //find the file to read
        File path = new File("../Practice/DataTest/DataReaderPractice.xlsx");   // ../ makes it global, anyone who has ur code can access it
        //public static String filePath = "DataTest/DataReaderPractice.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        //Workbook workbook = new XSSFWorkbook(inputStream); // another approach
        //first we r creating the path, we r taking the path to create a workbook using the  workbook factory. it is taking our path of the excel file we created and gonna read it
                //workbook is the excel file that we will read
        //workbook factory- Factory for creating the appropriate kind of Workbook (be it HSSFWorkbook or XSSFWorkbook), from the given input

        //so we have the file now- no we have to find the sheet in our excel we r going to read
        Sheet sheet = workbook.getSheetAt(0);// go to the excel and the first sheet and read the first index of that sheet
        //sheet sheet = workbook.getSheet("sheet1")// so u use this if u have a sheet name

        Row row = sheet.getRow(3); // so now we r in our sheet, so lets get the row from our sheet
        Cell cell = row.getCell(2); //so we want to find cell/column from our row. we r in our row and now we want to read the cell in our row
        System.out.println(cell);


    }
}
