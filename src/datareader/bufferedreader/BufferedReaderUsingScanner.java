package datareader.bufferedreader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferedReaderUsingScanner {
    public static void main(String[] args) {

        buff2();
    }

    public static void buff2(){

        Scanner scan = new Scanner(System.in);
        BufferedReader br = null;
        String line;

        System.out.println("Please enter the file name to read");

        try {
            br = new BufferedReader(new FileReader("JavaMapNotes"+scan.next()));
            //scan.next()- scan is the name of the file where the user will input
            while((line = br.readLine())!=null){
                System.out.println();

            }
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found");
            //e.printStackTrace();
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Error reading the file");
        }finally {
            System.exit(0);
        }


        //br.readline()


    }











}
