package datareader.filereaderusingscanner;

import java.io.*;
import java.util.Scanner;

public class ReadingFromDesktop {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("/Users/israt/Desktop/captmidn.txt");
        Scanner scan = new Scanner(file);
//        while(scan.hasNextLine()){
//            System.out.println(scan.nextLine());
        //}
   //Exporting the old file to a new file in the desktop
        String newFile = "******This is the new imported file***********";
        while(scan.hasNextLine()){
            newFile = newFile.concat(scan.nextLine()+"\n");
        }

        FileWriter writer = new FileWriter("/Users/israt/Desktop/NewImportedFileFromCaptmidn.txt");
        writer.write(newFile);
        writer.close();
    }
}
