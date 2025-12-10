package com.excelR.ListProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListProgram2 {
    public static void main (String[]args){
        Integer[] arr = {10, 23, 34, 123, 45,  123, 45, 76, 324, 12};

//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            list.add(arr[i]);
//            list.add(i, arr[i]);
//
//        }
//        System.out.println(list);
//        List<Integer>list= Arrays.asList(arr);
        List<Integer>list=List.of(arr);
        System.out.println(list);

        List<String>list2=new ArrayList<>();
        list2.add("one");
        list2.add("two");
        list2.add("three");
//        String[]arr2=new String[list2.size()];
//
//        for(int i=0;i<list2.size();i++){
//            arr2[i]=list2.get(i);
//
//        }
        String[]arr2=list2.toArray(new String[0]);
        System.out.println(Arrays.toString(arr2));



    }
}
