package map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;


//LinkedHashMap keeps the order its in the system in place
//in other words- it preserves the order of insertion
public class LearnLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> setValues = new LinkedHashMap<>();
        setValues.put("a",2);
        setValues.put("j",5);
        setValues.put("b",3);
        setValues.put("c",2);
        setValues.put("d",4);

        for(String values : setValues.keySet()){
            //values is going to be taking place of each one of the keys in the setValues
            //System.out.println(values);

            System.out.println(values +" : "+ setValues.get(values));
        }

        System.out.println(                                   );
        //another approach to print the keys and values together
        for(Map.Entry valuezzz : setValues.entrySet()){
            //entryset() is basically keys and values together
            System.out.println(valuezzz.getKey()+" : "+ valuezzz.getValue());
        }




    }







}
