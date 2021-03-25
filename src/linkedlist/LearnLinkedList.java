package linkedlist;


//its a flexible data structure
//its called a linked list because each value in the list knows the front and
//next elements
//it keeps the order of the elements. it will print in the order it was added
//no shifting occurs in linked list because the element knows about the one in front and next to it
//array list-shifting occurs whenever u make any change so linked list is faster


import java.util.Iterator;
import java.util.LinkedList;

public class LearnLinkedList {

    public static void main(String[] args) {
    linked();
    }


    public static void linked(){

        LinkedList<String> list = new LinkedList<>();
        list.add("Keith");
        list.add("Bob");
        list.add("Jose");
        list.add("Samantha");
        list.add("Dexter");
        //add by index and object
        list.add(5,"Sally");
        list.add(6,"Chelsea");



        //to use for each...  use object as the type
        for(String lists : list){
            System.out.println("Lists: "+lists);
        }

        //removing- remove() it removes from the front
        list.remove();
        System.out.println("After removing: "+list);

        //u can clear the entire list
        //list.clear();

    //you can get the first element of the list

        System.out.println("First element: "+list.getFirst());

    //you can get the last element
        System.out.println("Last element: "+list.getLast());


    //I want to get the element "Samantha" and not the entire list
        // do iterate

        System.out.println(list.get(5));// u can do this
        // but we r not going to always know index when we have millions of elements
// you can iterate through them and find the element using an iterator object

      //first- make an interator object
        //Iterator it = new Iterator();- instead of making a new iterator. we r going to use our linked list operator that we created
        Iterator it = list.iterator();
        //to use iterator- u have to use while loop()
        while(it.hasNext()){
            //.hasNext(); is boolean and it returns true if iteration has elements.
            // The .next(); method returns the next element.

            if(it.next()=="Dexter"){
                System.out.println("We found our element using Iterator- Dexter");
            }
        }



    }






    }


