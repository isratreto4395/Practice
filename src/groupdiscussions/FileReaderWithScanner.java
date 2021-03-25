package groupdiscussions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileReaderWithScanner {
    public static void main(String[] args) throws FileNotFoundException {
        filey();

    }

    public static void filey() throws FileNotFoundException {

//        try {
//            FileReader txt = new FileReader("GroupDiscussionNotes/Notes.txt");
//            Scanner scan = new Scanner(txt);
//            //System.out.println(scan.nextLine());
//            while(scan.hasNextLine()){
//                System.out.println(scan.nextLine());
//            }
//
//        } catch (FileNotFoundException e) {
//            System.out.println("File was not found- Please input the correct name");
//            //e.printStackTrace();
//        }


            FileReader txt = new FileReader("GroupDiscussionNotes/Notes.txt");
            Scanner scan = new Scanner(txt);
            //System.out.println(scan.nextLine());
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }


    }



}
