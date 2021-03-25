package arrayListProject;

import java.util.ArrayList;
import java.util.Iterator;

public class CallingAClassInArrayListClass {
    public static void main(String[] args) {

        callingAClass();
    }

    public static void callingAClass(){
        //Interview Question- Creating an array using  a constructor with parameters from another class
        //I can use info from another class and add input in a array

        //Question- how to store the specific user defined class object in this particular arrayList
        Employee e1 = new Employee("Naveen",27,"QA");
        Employee e2 = new Employee("Samantha",34,"DEV");
        Employee e3 = new Employee("Bob",57,"PROD MANAGER");

        //using this info to create an arrayList
        //I want to store the employee object in this arrayList
        //I want to store all the parameters in the employee class in the arrayList below
        //so I created three employee object in this method using the employee class
        //ArrayList<Integer> arr1 = new ArrayList<Integer>();- means I can only store integer value
        ArrayList<Employee> arr = new ArrayList<Employee>();//by putting Employee inside the wrap we r saying this array will contain the data from the employee object
        arr.add(e1);
        arr.add(e2);
        arr.add(e3);

        // iterator to traverse the values

        Iterator<Employee> it = arr.iterator();//u have to specify u r using the employee object
        //cant use for loop because Iterator doesnt go by indexes.
        //I cant use index here because I am using an object (Employees)
        while(it.hasNext()){//it.hasNext will check to see if it has a first value then a second... so on
             Employee emp = it.next();//becuase i want to iterate from the employee object
            //so i had to specify its getting its next line from the employee object. so its searching for data from the employee object
            //it can be a string, integer, whatever
            System.out.println(emp.employeeName + " " +emp.employeeAge+" "+emp.employeeDept);
        }
    }































}
