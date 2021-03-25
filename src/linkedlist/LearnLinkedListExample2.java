package linkedlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//using linked list as a list
public class LearnLinkedListExample2 {
    public static void main(String[] args) {
        inte();
    }
public static void inte() {
    List<Integer> integers = new LinkedList<>();
    integers.add(12);
    integers.add(124);
    integers.add(34);
    integers.add(77);
    integers.add(98);
    integers.add(165);

    integers.add(6, 132);
    integers.add(7, 45);
    integers.add(8, 89);
    integers.add(9, 55);

    for (Integer integ : integers) {
        System.out.println("Retrieve all elements: " + integ);
    }
    System.out.println(                             );
    Collections.sort(integers);
        System.out.println("Sorted integers: " + integers);


    System.out.println(                             );

    try {//using for each loop here gives an exception
        for(Integer integggs : integers) {
            integers.remove(5);
            integers.remove(7);
            System.out.println("After Removing using foreach loop: " + integers);

        }
    }catch (Exception e){
        System.out.println("Concurrent Modification Exception");
    }

    System.out.println(                             );

    //using iterator to retrieve elements
    Iterator ite = integers.iterator();
    while(ite.hasNext()){
        System.out.println("Using Iterator: "+ite.next());
    }
    //removing elements and using Iterator to retrieve the lists
    System.out.println(                             );

    integers.remove(0);
    Iterator iter = integers.iterator();
    while(iter.hasNext()){
        System.out.println("After removal using Iterator: " + iter.next());
    }

}




















}
