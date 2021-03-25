package datareader.bufferedreader;

import java.io.*;

public class UserInput {
    public static void main(String[] args) throws IOException {

        bufferedReader();
    }

public static void bufferedReader() throws IOException {

    System.out.println("Enter a number: ");
    //BufferedReader buffer = new BufferedReader(asking for input stream reader);

    InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(input);


        int n = Integer.parseInt(buffer.readLine());
        System.out.println(n);


}


}
