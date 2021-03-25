package datareader.filereaderusingscanner;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LearnFileReader3 {

    public static void main(String[] args) throws IOException {
    fileReader3();
    }


    public static void fileReader3() throws IOException {

        FileReader fileReader3 = new FileReader("SampleDirectory/RandomFile.txt");
        Scanner scan = new Scanner(fileReader3);
        while(scan.hasNextLine()){
            System.out.println(scan.nextLine());

        }
//        File file = new File("SampleDirectory/RandomFile.txt");
//       Scanner scan = new Scanner(file);
//        //System.out.println(scan.nextLine());
//        while(scan.hasNextLine()){
//            System.out.println(scan.nextLine());
//        }

    }


}
