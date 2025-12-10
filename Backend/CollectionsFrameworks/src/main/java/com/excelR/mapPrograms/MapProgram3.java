package com.excelR.mapPrograms;

import java.util.HashMap;
import java.util.Map;

public class MapProgram3 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.putIfAbsent(3,"three"); // check key is present or not . and add the new .
        System.out.println(map);

        map.replace(3,"five"); // it will replace only values not keys.
        System.out.println(map);

        map.remove(13); // it give any error and remove anything . if ket won't present.
        System.out.println(map);
        map.remove(3,"five"); // case must be same and value be same . then it will remove.
        System.out.println(map);


    }
}
