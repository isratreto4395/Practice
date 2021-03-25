package datareader.bufferedreader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LearnBufferedReaderExample3 {

    public static void main(String[] args) throws FileNotFoundException {

        example3();
        System.out.println(                             );
        example4();
    }

public static void example3(){

     String line1;
    FileReader reader12 = null;
    try {
        reader12 = new FileReader("DataReaderNotes/BufferedReaderVSScanner.txt");
        BufferedReader buffer12 = new BufferedReader(reader12);
        while((line1 = buffer12.readLine()) != null){
            System.out.println(line1);
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }


}

public static void example4() throws FileNotFoundException {

    FileReader reader13 = new FileReader("DataReaderNotes/BufferedReaderVSScanner.txt");
    Scanner scan = new Scanner(reader13);
    while(scan.hasNextLine()){
        System.out.println(scan.nextLine());
    }
}
}
