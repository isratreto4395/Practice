package map.hashmap;

import arrayListProject.Employee;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ImplementingClassUsingMap {
    public static void main(String[] args) {
        implementation();

    }

    public static void implementation(){
        EmployeeClass empID1 = new EmployeeClass("Rebecca", 76,"BUISNESS ANALYST");
        EmployeeClass empID2 = new EmployeeClass("Roshan",64 ,"MANAGEMENT");
        EmployeeClass empID3 = new EmployeeClass("Reto", 25,"QA");
        EmployeeClass empID4 = new EmployeeClass("Russell", 34,"DEV");
        EmployeeClass empID5 = new EmployeeClass("Rimon", 22,"QA");

        //Map<Integer, EmployeeClass> mappy = new HashMap<>();
        //Map<Integer, EmployeeClass> mappy = new LinkedHashMap<>();
        TreeMap<Integer, EmployeeClass> mappy = new TreeMap<>();
        mappy.put(1,empID1);
        mappy.put(2,empID2);
        mappy.put(3,empID3);
        mappy.put(4,empID4);
        mappy.put(5,empID5);

        for(Map.Entry<Integer,EmployeeClass> map : mappy.entrySet()){
            int key = map.getKey();
            EmployeeClass em = map.getValue();
            System.out.println(key + " : "+em.employeeName+ " , "+em.employeeAge + " , "+em.employeeDept );
        }
    }



















}
