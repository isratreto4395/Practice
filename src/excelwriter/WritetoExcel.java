package excelwriter;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritetoExcel {
    public static void main(String[] args) throws IOException {
        Object [][] studentDetails= {
                {"sl","FirstName","LastName","Phone","Address"},
                {"101","Aleign","Negash","9873432983","VA,USA"},
                {"102","Simar","Kaur","8873432983","IL,USA"},
                {"103","Easha","Khanam","7873432983","NY,USA"},
                {"103","Nafiz","Islam","6873432983","PA,USA"}
        };

        writetoExcel("../Practice/DataTest/SampleExcel_I_DID_IT.xlsx","StDetails",studentDetails);
    }



    public static void writetoExcel(String filePath, String sheetName, Object[][] anyName) throws IOException {
        // Before we start writing- we have to create a workbook first

        XSSFWorkbook workbook = new XSSFWorkbook();// so this line will create my excel workbook
        //after creating the workbook, i have to create the sheets
        XSSFSheet sheet = workbook.createSheet(sheetName);//So i am creating this sheet in my excel workbook and naming my spreadsheet "sheetname" because i will name it when i execute the code in the main method
        //now we need to create a rows in our spreadsheet
        System.out.println("Excel file is created");
        int rowNumber = 0;
        for(Object[] dat : anyName){
            XSSFRow row = sheet.createRow(rowNumber++);// i want to insert row in my spreadsheet and i want the row number to increment each time a row is created

            int cellNumber = 0;
            for(Object field : dat){
                XSSFCell cell = row.createCell(cellNumber++);// I want to insert column once i create a row
            //we have to check data types- becasue we can have String type or Integer type

                if(field instanceof String){//so we r comparing field with String--> if our input is String then it will set all the cell values to string
                    //The instanceof in java is also known as type comparison operator
                    // because it compares the instance with type.
                    // It returns either true or false.
                    // If we apply the instanceof operator with any variable that has null value, it returns false.
                    cell.setCellValue((String)field);
                }else if (field instanceof Integer) {////so we r comparing field with String--> if our input is String then it will set all the cell values to string
                    cell.setCellValue((Integer) field);
                }





            }

            FileOutputStream outputStream = new FileOutputStream(filePath);
            workbook.write(outputStream);
            workbook.close();


        }






    }
}
