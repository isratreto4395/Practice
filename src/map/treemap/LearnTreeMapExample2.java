package map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class LearnTreeMapExample2 {
    public static void main(String[] args) {
        TreeMap<String, String> color = new TreeMap<>();
        color.put("R", "Red");
        color.put("O", "Orange");
        color.put("G", "Green");
        color.put("P", "Pink");
        color.put("B", "Blue");
        color.put("M", "Magenta");
        color.put("Gr", "Gray");
        color.put("Bl", "Black");
        for(Map.Entry colors : color.entrySet()){
            System.out.println(colors.getKey()+" : "+ colors.getValue());
        }

        System.out.println();

        for(String colorzzz : color.keySet()){
            System.out.println(colorzzz+" : " +color.get(colorzzz));
        }
















    }
}
