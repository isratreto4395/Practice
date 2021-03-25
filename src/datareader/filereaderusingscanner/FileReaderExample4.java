package datareader.filereaderusingscanner;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileReaderExample4 {
    public static void main(String[] args) {
        fileReader();
    }

    public static void fileReader(){
        try {
            FileReader read = new FileReader("JavaMapNotes/Map.txt");
            Scanner scan = new Scanner(read);
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }




























}
