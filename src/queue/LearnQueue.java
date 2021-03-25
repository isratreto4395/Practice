package queue;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args) {
        Queue<String> que = new LinkedList<>();
        que.add("Imayah");
        que.add("Isaqh");
        que.add("Russell");
        que.add("Reto");
        que.add("Monika");
        que.add("Mujammel");
        que.add("Rimon");
        que.add("Onisha");

        for(String st : que){
            System.out.println("Couple names: "+st);
        }
        System.out.println("***********************************************************");
        System.out.println(que.element());//it will print the first element
        System.out.println("***********************************************************");
        System.out.println(que.poll());
        System.out.println("***********************************************************");
        System.out.println(que.peek());
        System.out.println("***********************************************************");
        for(String ste : que){
            System.out.println("Couple names: "+ste);
        }






    }
}
