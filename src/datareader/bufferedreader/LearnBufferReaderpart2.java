package datareader.bufferedreader;

import java.io.*;
import java.util.Scanner;

public class LearnBufferReaderpart2 {
    public static void main(String[] args) {
        bufferedReader102();
        System.out.println("********************");
        fileReader();

    }

public static void bufferedReader102(){
        String line;
    BufferedReader buffer1 = null;
    FileReader reader = null;
    try {
         reader = new FileReader("SampleDirectory/RandomFile.txt");
         buffer1 = new BufferedReader(reader);
        while((line = buffer1.readLine()) !=null){
            System.out.println(line);
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }

}

//easier way to do it but previous method is the best version
public static void fileReader(){
    try {
        FileReader reader101 = new FileReader("SampleDirectory/RandomFile.txt");
        Scanner scan = new Scanner(reader101);
        while(scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }
    } catch (FileNotFoundException e) {
        System.out.println("File Not Found Exception");
        //e.printStackTrace();
    }
}



}
