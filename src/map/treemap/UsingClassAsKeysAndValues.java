package map.treemap;

import interface_Example_2.ByThrees;
import interface_Example_2.Series;

import java.util.TreeMap;

public class UsingClassAsKeysAndValues {
    public static void main(String[] args) {

        //so u can use ur classes as keys and values
        TreeMap<Series, ByThrees> usingClass = new TreeMap<>();
        usingClass.keySet();
    }
}
