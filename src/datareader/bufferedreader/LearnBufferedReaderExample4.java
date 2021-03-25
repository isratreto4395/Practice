package datareader.bufferedreader;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class LearnBufferedReaderExample4 {
    public static void main(String[] args) {
       example4();
        System.out.println("***********************************");
        fileReader107();
    }

public static void example4(){
        String line;
    FileReader reader102 = null;
    try {

        reader102 = new FileReader("DataReaderNotes/BufferedReaderVSScanner.txt");
        BufferedReader buffer102 = new BufferedReader(reader102);
        while((line = buffer102.readLine())!=null){
            //if its null(blank) throw the exception"Unable to read file"
            //If it is not null, read the lines
            System.out.println(line);
        }

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }


}


public static void fileReader107(){
    try {
        FileReader read = new FileReader("DataReaderNotes/BufferedReaderVSScanner.txt");
        Scanner scan = new Scanner(read);
        while(scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }

}



}
