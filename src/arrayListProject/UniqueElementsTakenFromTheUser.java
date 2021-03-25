package arrayListProject;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Create a list of unique elements taken from the user. sort and print these elements
//test output:
//Enter 10 integers: 1 8 9 2 6 6 1 3 5 5
//Console- Your unique sorted elements: [1,2,3,5,6,8,9]
public class UniqueElementsTakenFromTheUser {

    public static void main(String[] args) {
    uniqueElements();
    }

    public static void uniqueElements(){
//soultion:
        //1. Read N elements from the user
        //2. If the elements does not exist in the ArrayList, add it
        //3. Sort the Arraylist using Collections.sort()
        ArrayList<Integer> unique = new ArrayList<>();
        System.out.println("Enter 10 integers: ");
        Scanner input = new Scanner(System.in);

        for(int i = 0; i<10; i++) {
            int temp = input.nextInt();
            if (!unique.contains(temp)) //we are adding integers if the arraylist does not contain our element
                unique.add(temp);

        }
            Collections.sort(unique);
            System.out.println(unique);


        }

}
