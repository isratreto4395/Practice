package arrayListProject;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample5 {
    public static void main(String[] args) {
        example5();
    }


    public static void example5(){
        ArrayList<String> bills = new ArrayList<>();
        bills.add("Hospital Bill");
        bills.add("Electricity Bill");
        bills.add("Water Bill");
        bills.add("Phone Bill");
        bills.add("Internet Bill");
        bills.add("Credit Card Bills");

        bills.add(6,"Rent");
        bills.add(7,"Loans");

        System.out.println(bills);

        System.out.println(                                               );

        for(String bill : bills){
            System.out.println(bill);
        }

        System.out.println(                                               );
        bills.remove(6);
        System.out.println("After removing an element: "+bills);

        System.out.println(                                               );
        System.out.println("Size of the ArrayList: "+bills.size());

        System.out.println(                                               );

        System.out.println(bills.get(0));

        System.out.println(                                               );

        bills.set(6,"Mortgage");
        System.out.println(bills);

        System.out.println(                                               );

        Collections.sort(bills);
        System.out.println(bills);

        System.out.println(                                               );
        for(int i=0; i<bills.size();i++){
            if(bills.get(i).equals("Mortgage")){
                System.out.println("found the specific element: "+bills.get(i));
            }

            System.out.println(                                               );

            try {for(int m = 0; m< bills.size(); i++) {
                if (bills.get(i).equals("Electricity Bill")) {
                    System.out.println("Another element: " + bills.get(i));
                }
            }

            }catch(IndexOutOfBoundsException e){
                System.out.println("Index Out Of Bounds Exception");

            }

        }















    }
















}
