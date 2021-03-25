package arrayListProject;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //simple example of an array
        String[] fruits = new String[4];
        fruits[0] = "Mango" ;
        fruits[1] = "Watermelon" ;
        fruits[2] = "Strawberry" ;
        fruits[3] = "Apple" ;
        System.out.println(fruits);


        //example of array list

        ArrayList fruitList = new ArrayList();
        fruitList.add("Mango");
        fruitList.add("Watermelon");
        fruitList.add("Strawberry");
        fruitList.add("Apple");

        fruitList.remove("Strawberry");
        //fruitList.clear();
        System.out.println(fruitList.contains("Raspberry"));
        System.out.println(fruitList);

    }






}
