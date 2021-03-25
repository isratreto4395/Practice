package map.hashmap;

import java.util.HashMap;
import java.util.Map;



//Map Properties:
// 1. they contain values based on key
//2. they are not in order- the sequence in which they will enter the map is not guaranteed in the output when we print it out
//3. "KEY" should be unique so it cant have duplicates- so if u have a duplicate key with a value, it will jjst replace the previous value but it will not print both the values
//4. "VALUE" can be duplicated

public class MapExample1 {
    public static void main(String[] args) {
    map();
    }

    public static void map(){
        Map<String, String> loginInfo = new HashMap<>();
//map is an interface so you have to create an instance of a class that implements the map interface
 //in order to use map. so we are using the hashMap class because it implements the map Interface.

    loginInfo.put("askar2","Sam0mo#");
    loginInfo.put("sambal","Mo*56hy");
    loginInfo.put("salad23","Wh@tsup23");
    loginInfo.put("rodeoshack","Help&cry12");
    loginInfo.put("askar2","msopai23*");//this will replace the previous value("Sam0mo#) to "msopai23"

        System.out.println(loginInfo);//it will not print in order it was entered into the system

        System.out.println(                                    );

        //to get the value of a specific key
        System.out.println("Specific key: "+ loginInfo.get("askar2"));

        System.out.println(                                    );

        //we can also check if a key or value is within our map or not by using contains key
        System.out.println(loginInfo.containsKey("sambal"));// will return true if key is found in our map
        System.out.println(loginInfo.containsValue("Mo*56hy"));
        System.out.println(loginInfo.containsKey("donkey"));//will return false because it is not in our map

        System.out.println(                                    );

        System.out.println("size of the Map: "+ loginInfo.size());

        System.out.println(                                    );

        //so this just removes the key but u can still access the values
        System.out.println("After removing: "+ loginInfo.remove("sambal"));


        System.out.println(                                    );



        //printing all the values
        //entry means a pair of values such as key value pairs
        //so one pair is actually an entry object

        //A Map doesn't allow duplicate keys, but you can have duplicate values.
        // HashMap and LinkedHashMap allow null keys and values, but TreeMap doesn't allow any null key or value.
        //A Map can't be traversed, so you need to convert it into Set using keySet() or entrySet() method.

        for(Map.Entry pairEntry : loginInfo.entrySet()){
            System.out.println(pairEntry.getKey()+" : "+ pairEntry.getValue());
        }











    }















}
