package datareader.filereaderusingscanner;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LearnFileReaderPart2 {
    public static void main(String[] args) throws FileNotFoundException {
    fileReader2();
    }

public static void fileReader2() {
    try{
        FileReader file = new FileReader("/Users/israt/Desktop/captmidn.txt");
        Scanner scan = new Scanner(file);
        while(scan.hasNextLine()){
            System.out.println(file);
        }
    }catch(Exception e){
        System.out.println("File not found Exception");
    }



    //       FileReader file = new FileReader("/Users/israt/Desktop/captmidn.txt");
//        Scanner scan = new Scanner(file);
//        //System.out.println(scan.nextLine());
//        while(scan.hasNextLine()){
//            System.out.println(file);
        }



}






