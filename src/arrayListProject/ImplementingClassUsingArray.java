package arrayListProject;

import java.util.ArrayList;
import java.util.Iterator;

public class ImplementingClassUsingArray {
    public static void main(String[] args) {
    implement();
    }

    public static void implement(){
        Employee em1 = new Employee("John",34,"QA");
        Employee em2 = new Employee("Jacob",67,"PROD");
        Employee em3 = new Employee("Chelsea",56,"DEV");
        Employee em4 = new Employee("Davon",45,"QA");
        Employee em5 = new Employee("Aron",88,"PROD");
        ArrayList<Employee> emp = new ArrayList<>();

        emp.add(em1);
        emp.add(em2);
        emp.add(em3);
        emp.add(em4);
        emp.add(em5);

//        for(Employee employ : emp){
//            System.out.println(employ);
        System.out.println(emp.contains("John"));
        Iterator<Employee> ite = emp.iterator();
        while(ite.hasNext()){
            Employee employee = ite.next();
            System.out.println("Employee name : "+employee.employeeName+" \n"+"Employee age : "+employee.employeeAge+"\n"+"Employee Department : "+employee.employeeDept);


        }

    }



















}
