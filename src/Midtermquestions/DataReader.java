package Midtermquestions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Stack;

public class DataReader {
    String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car";
    FileReader fileRead = null;
    BufferedReader buffRead = null;
    String line;
    //ConnectToSqlDB connect = new ConnectToSqlDB();
    //Created stack and linked list
    Stack<String> stack = new Stack<>();
    LinkedList<String> linkedList = new LinkedList<>();
    int count = 1;

}
