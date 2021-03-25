package map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {
    public static void main(String[] args) {
        hashMap();
    }

public static void hashMap(){
    HashMap<String,Double> shoppingList = new HashMap<>();
    shoppingList.put("Chip",4.50);
    shoppingList.put("cookies",3.75);
    shoppingList.put("Salsa",2.25);
    shoppingList.put("Cereal",4.50);
    shoppingList.put("Chocolate",1.75);
    shoppingList.put("Granola Bars",6.40);
    //shoppingList.put("Chip",7.45);


    System.out.println(shoppingList);
    for(Map.Entry list : shoppingList.entrySet()){
        System.out.println(list.getKey()+" : "+ list.getValue());
    }


    shoppingList.put("Spinach", 2.34);
    shoppingList.remove("Granola Bars");
    shoppingList.containsKey("Chip");
    shoppingList.containsValue(4.50);

}






















}
