package map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
    public static void main(String[] args) {
        hash();
    }

    public static void hash(){
        HashMap<Integer, String> quantity = new HashMap<>();
        quantity.put(3,"short sleeves shirt");
        quantity.put(4,"Skirts");
        quantity.put(1,"Cardigan");
        quantity.put(5,"Scarf");
        quantity.put(9,"Headband");

        for(Map.Entry mappy : quantity.entrySet()){
            System.out.println(mappy.getKey()+" : "+mappy.getValue());
        }

        System.out.println();
        System.out.println("Key: "+quantity.containsKey(5));
        System.out.println("Value : "+quantity.containsValue("Scarf"));







    }




















}
