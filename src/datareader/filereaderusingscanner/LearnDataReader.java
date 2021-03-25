package datareader.filereaderusingscanner;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LearnDataReader {
    public static void main(String[] args) throws IOException {
        fileReader101();
    }


    public static void fileReader101() throws IOException {
        FileReader txtFile = new FileReader("DataTest/Sample.txt");
        Scanner scan = new Scanner(txtFile);//we want to scan through the "file"-txtfile
        //System.out.println(scan.nextLine());// so this is reading line by line
        //so it will print the first line


        System.out.println("*********Printing all the line************");
        //how to print all the line
        //while the scanner has the next line, print all the line
        while(scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }

        //System.out.println("*********Export the old txt file to a new txt file");
        //export the txtFile to a new txtFile
        String newTxtFile = "This is the exported file. ";
        while(scan.hasNextLine()){
            newTxtFile = newTxtFile.concat(scan.nextLine()+"\n");
            //so we are starting with this string called file content
            //and we r concatenating the previous string with the new line
            //and we r adding to it just like that.. it'll get bigger and bigger
        }
        //using fileWriter to write txt into the new file
        FileWriter writer = new FileWriter("DataTest/NewImportedFile.txt");
        writer.write(newTxtFile);
        writer.close();


    }




}
