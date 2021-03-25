package linkedlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LearnLinkedListExample3 {
    public static void main(String[] args) {
    learnLinked();
    }

    public static void learnLinked(){
        LinkedList<Integer> linked = new LinkedList<>();
        linked.add(67);
        linked.add(43);
        linked.add(190);
        linked.add(233);
        linked.add(4,57);
        linked.add(5,57);
        linked.add(6,97);
        linked.add(7,570);
        linked.add(8,345);

        //retrieve all the elements
        for(Integer inte : linked){
            System.out.println("Integer: " +inte);
        }

        //another approach
        //An Iterator can be used to loop through an LinkedList.
        // The method hasNext( ) returns true if there are more elements in LinkedList and false otherwise.
        // The method next( ) returns the next element in the LinkedList and throws the exception NoSuchElementException
        // if there is no next element.

        System.out.println(                                                    );
        Iterator iter = linked.iterator();
        while(iter.hasNext()){
            System.out.println("Iteration: "+iter.next());
        }

    //another approach
        System.out.println();
        System.out.println("The LinkedList elements are: ");
        for (Iterator i = linked.iterator(); i.hasNext();) {
            System.out.println(i.next());
        }

        System.out.println();
        Collections.sort(linked);
        System.out.println("Sorted List: "+linked);

        System.out.println();
        System.out.println("First Element: "+linked.getFirst());
        System.out.println("Last Element: "+linked.getLast());






    }






















}
