package arrayListProject;

import java.util.ArrayList;
import java.util.Collections;

//dynamic array --> ArrayList
//Static array---> array
//1. can contain duplicate values/elements
//2. maintains insertion order
//3. It is not synchronized- it is not thread safe that is why arrayList is slow compare to other list
//4. allows random access to fetch any element because it stores the values on the basis of indexes


public class StringArrayList {
    public static void main(String[] args) {
    IntegerArray();

    }


public static void IntegerArray(){
        //we r creating this array list of integers and allocating it inside the memory
    ArrayList<Integer> integer = new ArrayList<>();

    ArrayList<Double> doubles = new ArrayList<>();


    //In an ArrayList, we can store objects(String, Integer, Boolean, Double, Character..)
    //not a primitive type(int, boolean, double, char..)
    //when we specify the type of the arraylist, we should use the wrapper class

    //when we create a ArrayList object, it has some methods

    ArrayList<String> fruits = new ArrayList<>();
    fruits.add("Mango");
    fruits.add("Durian");
    fruits.add("Watermelon");
    fruits.add("Jack Fruit");
    fruits.add("Orange");
    fruits.add("Apple");
    fruits.add("Grape");
    fruits.add("Blueberry");
    System.out.println(fruits);

    System.out.println(                                       );

    //Adding by index
    fruits.add(0,"Strawberry");
    System.out.println(fruits);

    System.out.println(                                       );

    //adding at index 2
    fruits.add(2,"Guava");
    System.out.println("* Adding by index: " +fruits);

//Accessing an item inside the ArrayList- Using the get() method
//when we were working with arrays, we used {} but in ArrayList, we cant use{}
//We use get() method that will get an element at an index

    System.out.println(                                       );
    System.out.println("*****Accessing item in the ArrayList*******");
    System.out.println(fruits.get(0));//1st element
    System.out.println(fruits.get(1));//2nd element
    System.out.println(fruits.get(2));//3rd element
    System.out.println(fruits.get(3));//4th element
    System.out.println(fruits.get(4));//5th element
    System.out.println(fruits.get(5));//6th element
    System.out.println(fruits.get(6));//7th element

    //assign an element in the ArrayList to be equal to another value- set() method

    System.out.println(                                       );

    fruits.set(3,"Olive");
    //So i replaced Durian.. so Durian does not have an object that is referencing it
    //so it will be removed from the memory using the java garbage collector
    System.out.println("* Replace: " +fruits);


    //removing an item from the ArrayList- removing by index & removing by value

    //removing by index

    System.out.println(                                       );

    fruits.remove(1);
    System.out.println("* Removing by index: "+ fruits);

    System.out.println(                                       );

    fruits.remove("Mango");
    System.out.println("* Removing by value: "+ fruits);

    //how to retrieve all the value from the ArrayList
    System.out.println(                         );
    System.out.println("******Retrieve all the value*******");
    for(String fruit : fruits){
        System.out.println("Fruits: " +fruit);
    }
    System.out.println(                                       );
// use the size() method to get elements that are currently inside the ArrayList
    System.out.println("* The size of the ArrayList: "+fruits.size());

// to remove all elements- clear()

    //fruits.clear();
    //System.out.println(fruits); // it will return [empty]

    System.out.println(                                       );

    System.out.println("looping through an ArrayList");

    for(int i = 0; i<fruits.size();i++){
        System.out.println("* Using forLoop :"+fruits.get(i));
    }

    System.out.println(                                       );


    //use the sort() method of the collections class for sorting lists
    //alphabetically or numerically

    Collections.sort(fruits);//fruits will be sorted alphabetically
    System.out.println("* Sort method: " +fruits);


    //get a specific element
    System.out.println(                                       );

    for(int i = 0; i<fruits.size();i++){//start from index 0

        if(fruits.get(i).equals("Guava")){
            System.out.println("* Using forLoop to get a specific element:"+fruits.get(i));
            break;// i put break here because I want the loop to break once it gets "Guava"
        }

    }




}
    public static <E> void unknownDataType() {
        //if you dont know what datatype your array list will be- it could be string or integer or something else
        //generic type
        ArrayList<E> arr = new ArrayList<E>();//u would have to add <E> next to static in your method you created or the method this code is under



    }




}
