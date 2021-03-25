package map.treemap;


import java.util.Map;
import java.util.TreeMap;

//TreeMap maintains natural order
//so it maintains alphabetic or numerical order
public class LearnTreeMap {
    public static void main(String[] args) {

        LearnTreeMap shirtSize = new LearnTreeMap();
        shirtSize.treeMap();

    }

    public void treeMap(){
        TreeMap<Integer, String> shirt = new TreeMap<>();
        shirt.put(34,"XXS");
        shirt.put(48,"XXXL");
        shirt.put(38,"S");
        shirt.put(42,"L");
        shirt.put(44,"XL");
        shirt.put(40,"M");
        shirt.put(36,"XS");
        shirt.put(46,"XXL");

        for(Integer values : shirt.keySet()){
            //System.out.println(values);//get the key
            //System.out.println(shirt.get(values));//get the values
            System.out.println(values +" : "+shirt.get(values));
        }

        System.out.println(                                );
        //printing all the keys and values
        for(Map.Entry sizes : shirt.entrySet()){
            System.out.println(sizes.getKey()+" : "+ sizes.getValue());
        //it will print the keys in numerical order
        }

    }




}
