package com.excelR.mapPrograms;

import java.util.HashMap;
import java.util.Map;

public class MapProgram1 {
    public static void main(String[] args) {
        Map< Integer,String> map=new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(3,"three");
//        map.put(3,"three");
//        map.put(3,"four");
//        map.put(4,"three"); map allows duplicate values but not duplicate keys. and old value will replace with new value.
        System.out.println(map);

        // getting value

        System.out.println(map.get(1));
        System.out.println(map.get(11));
        System.out.println(map.getOrDefault(1,"xxx"));
        System.out.println(map.getOrDefault(11,"xxx"));
    }
}
