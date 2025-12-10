package com.excelR.mapPrograms;

import java.util.*;

public class MapProgram2 {
    public static void main(String[] args) {
        Map<Integer,String> map;
        map=new HashMap<>();

//        map.put(1,"one");
//        map.put(2,"two");
//        map.put(3,"three");
//        map.put(4,null);
//        map.put(null, "five");
        System.out.println(map+"HashMap");

//        map=new Hashtable<>();
//        map.put(1,"one");
//        map.put(2,"two");
//        map.put(3,"three");
//        map.put(4,null);   null pointer exception
//        map.put(null, "five");  keys should not be null.

        System.out.println(map+" Hashtable");


        map=new LinkedHashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,null);
        map.put(null, "five");


        System.out.println(map+" LinkedHashMap");


        map=new TreeMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,null);
//        map.put(null, "five");  keys should not be null. not be allowed in treeMap.
        System.out.println(map+" TreeMap");

    }
}
