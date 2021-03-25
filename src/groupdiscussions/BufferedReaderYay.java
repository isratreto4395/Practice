package groupdiscussions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderYay {
    public static void main(String[] args) {
    buffy();
    }

    public static void buffy(){
        FileReader fr = null;
        BufferedReader br = null;

        String line;


        try {
            fr = new FileReader("GroupDiscussionNotes/Notes.txt");
            br = new BufferedReader(fr);
            while((line=br.readLine())!=null){
                System.out.println(line);

            }

        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
            //e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error is reading the file");
            //e.printStackTrace();
        }


    }



















}
