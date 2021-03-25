package exception;

import java.util.ArrayList;

public class ExceptionExample {
    public static void main(String[] args) {

        try{
            int[] a = null;
            System.out.println(a[2]);
        }catch(Exception e){
            System.out.println("It is a NullPointerException");
        }


        try{
            int[] a = {5};
            System.out.println(a[2]);
        }catch(Exception e){
            System.out.println("It is a ArrayIndexOutOfBoundsException");
        }



        try{
            String[] pets = {"dog", "cat", "monkey"};
            System.out.println(pets[3]);
        }catch(Exception e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }


        try{
            ArrayList<String> list = new ArrayList<String>();
            list.get(0);
        }catch(Exception e){
            System.out.println("IndexOutOfBoundsException");
        }


        try{
            ArrayList<String> list = null;
            list.get(0);
        }catch(NullPointerException e){
            System.out.println("Its a NullPointerException");
        }





    }

}
