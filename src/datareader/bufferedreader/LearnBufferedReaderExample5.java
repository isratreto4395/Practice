package datareader.bufferedreader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LearnBufferedReaderExample5 {
    public static void main(String[] args) {
        LearnBufferedReaderExample5 example5 = new LearnBufferedReaderExample5();
        example5.bufferedReader();
    }

    public void bufferedReader(){
        String data;
        FileReader file = null;
        try {
            file = new FileReader("JavaMapNotes/Map.txt");
            BufferedReader buffer = new BufferedReader(file);
            while((data = buffer.readLine())!=null){
                System.out.println(data);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }






















}
