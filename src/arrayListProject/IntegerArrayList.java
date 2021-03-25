package arrayListProject;


import java.util.ArrayList;

import java.util.Collections;

public class IntegerArrayList {
    public static void main(String[] args) {
      IntegerArrayList integ = new IntegerArrayList();
      integ.integer();

    }

public void integer(){
    ArrayList<Integer> integers = new ArrayList<>();

    integers.add(45);
    integers.add(156);
    integers.add(178);
    integers.add(90);
    integers.add(12);
    integers.add(54);
    integers.add(89);
    integers.add(-77);
    System.out.println(integers);

    //for each loop to retrieve all the values
    System.out.println(                                           );
    for(Integer inte : integers){
        System.out.println("For each loop(retrieve all values) "+inte);
    }

    System.out.println(                                           );
    integers.add(8,58);
    integers.add(9,123);
    integers.add(10,34);
    integers.add(11,145);
    System.out.println("adding by index: "+ integers);


    System.out.println(                                           );
    //removing by index
    integers.remove(9);
    System.out.println("Removing: "+integers);


    //print size
    System.out.println(                                           );
    System.out.println("size of the array: "+integers.size());

    //sorting the array numerically
    System.out.println(                                           );
    Collections.sort(integers);

    System.out.println("sorting numerically: "+integers);



    }



























}
