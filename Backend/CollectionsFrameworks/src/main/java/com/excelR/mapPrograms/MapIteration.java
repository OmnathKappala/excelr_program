package com.excelR.mapPrograms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapIteration {
    public static void main(String[] args) {


        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= 10; i++) {
            map.put(i, i + 100);
        }
        System.out.println(map);

        System.out.println("--------------");
        // iterate keys
        Set<Integer> keys = map.keySet();// keys are unique  , storage in from of set.
        System.out.println(keys);

        System.out.println("--------------");
        // iterate values
        Collection<Integer> values = map.values(); // contains duplicate so stored in format of collections.
        System.out.println(values);

        System.out.println("--------------");
        // iterate in key -value pair

        Set<Map.Entry<Integer, Integer>>  pairs = map.entrySet();
        System.out.println(pairs);
        System.out.println("--------------");
        for(Map.Entry<Integer, Integer>entry:pairs){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println("-------------");
                 map.forEach((k,v)->System.out.println(k+" "+v));
    }
}
