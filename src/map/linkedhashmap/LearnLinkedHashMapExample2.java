package map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LearnLinkedHashMapExample2 {
    public static void main(String[] args) {

        linkedhashy();
    }

    public static void linkedhashy(){
        LinkedHashMap<String, String> alphabets = new LinkedHashMap<>();
        alphabets.put("A","Apple");
        alphabets.put("O","Orange");
        alphabets.put("C","Cantaloupe");
        alphabets.put("D","Durian");
        alphabets.put("W","Watermelon");
        alphabets.put("J","Jack Fruit");
        alphabets.remove("W");

        for(Map.Entry fruits : alphabets.entrySet()){
            System.out.println(fruits.getKey()+" : "+ fruits.getValue());
        }

        System.out.println();

        for(String val : alphabets.keySet()){
            System.out.println(val+" : "+alphabets.get(val));
        }

    }













}



