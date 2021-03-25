package datareader.bufferedreader;

//buffered reader isnt reading the files
//we pass parameters in the buffered reader that reads the file like input stream reader or file reader
//we wrap those class(input stream reader or file reader) in the buffered reader
//and what that does is its safer for your computer and more efficient to send all the data into a buffer and then spit it out


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LearnBufferedReaderWithExplanation {
    public static void main(String[] args) {

        buff();
    }


    public static void buff(){
        BufferedReader br = null; // we are set it to null because at the moment we dont know what the file we r going to read yet
        String line; //since we r going to read the file line by line, we want a variable that stores each line as the program loops through

        try {
            FileReader fi = new FileReader("JavaMapNotes/Map.txt");
            br = new BufferedReader(fi);// we r reading the fr file
            while((line = br.readLine()) != null) {
                // //br.readline()- it will read the line automatically
                // != null - means if the line is null that means the file is at the end of the file and theres nothing more to read
                //so we r setting "variable line" to to the line of the file
                //so we r saying as long as there is a line to be read as theres still text in that file so we r gonna keep looping through and printing it out

                System.out.println(line);

            }

        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("File was not found");
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Error reading the file");
        }


    }





















}
