package datareader.bufferedreader;

//bufferreader isnt whats reading the file
//a bufferreader actually surrounds a input stream reader
// which is actaully an object or file reader and those are what the objects
//read the text in a while
// wrapping that in a bufferReader makes it safer for your computer and more
//efficient to send all the data into a buffer and then spit it out that way



//BufferedReader can have other parameters


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LearnBufferedReader {

    public static void main(String[] args) {
        bufferedReader101();
    }

public static void bufferedReader101(){
    BufferedReader buffer = null;
// we set it to null because we want to instantiate the new buffered reader inside the try&catch
//
    String line;
    FileReader file = null;
    try {
        //or buffer = new BufferedReader(new FileReader("SampleDirectory/RandomFile.txt"));
        file = new FileReader("SampleDirectory/RandomFile.txt");
        buffer = new BufferedReader(file);

        //to read all the line

        while((line = buffer.readLine())!=null){
            System.out.println(line);
        }
    } catch (FileNotFoundException e) {
        System.out.println("File not found Exception");
        //e.printStackTrace();
    } catch (IOException e) {
        //e.printStackTrace();
    }

}
}
