package map.hashmap;


//hashMap is a class which implements the Map Interface
//it extends AbstractMap
//Interview points- what is hashMap?
    // it contains only unique elements
    //it stores the values- key- value pair
    //it may have one null key and multiple null values
    //it maintains no order
    //when you remove a key, the list doesnt get shifted =... it just simply removes it from its palce but that doesnt mean the next value will take its place
//hashMap is non-synchronized- non thread safe
// if it is used in multi-threading environment
// then more then one thread can access and process the hashMap simultaneously
//so if multiple threads are running then hashMap object can be accessed by all the threads
//performance of the hashMap will be increased automatically
//concurrent modification exception- fail-fast condition






import java.util.HashMap;
import java.util.Map;

public class HashMapWithExplanation {
    public static void main(String[] args) {
    mappy();
    }

    public static void mappy(){

        HashMap<String, Integer> ha = new HashMap<>();
        ha.put("Karen",20);
        ha.put("Kate",10);
        ha.put("Sam",23);
        ha.put("Mike",17);
        ha.put("Mel",17);


        for(Map.Entry en : ha.entrySet()){
            System.out.println(en.getKey()+" : "+en.getValue());
        }

        System.out.println();
        System.out.println(ha.get("Karen"));
        System.out.println();
        System.out.println(ha.get("Mike"));
        System.out.println(ha.remove("Sam"));



        System.out.println("*****INTERVIEW QUESTION*****");
        //we want to use this class in our hashamp "CallingADifferentClassWithConstructorInHashMap"
        //using the class reference
        //so there are 10 employees, and i want to store their name, age, dept one by one
        //so i am using the info from the "calling..." class
        HashMap<Integer, EmployeeClass> emp = new HashMap<>();
        EmployeeClass employees1 = new EmployeeClass("Tom",25,"Admin");
        EmployeeClass employees2 = new EmployeeClass("Pat",45,"QA");
        EmployeeClass employees3 = new EmployeeClass("Stan",65,"DEV");

        emp.put(1,employees1);
        emp.put(2,employees2);
        emp.put(3,employees3);

        //traverse the hashmap

        for(Map.Entry<Integer, EmployeeClass> m : emp.entrySet()){
            int key = m.getKey();
            EmployeeClass employ = m.getValue();
            System.out.println("Employee " +key + " Info:");
            System.out.println(employ.employeeName + " "+employ.employeeAge + " "+employ.employeeDept);

            //m.getKey() will return Integer because we specified our key to be integer
        }
    }





















}
