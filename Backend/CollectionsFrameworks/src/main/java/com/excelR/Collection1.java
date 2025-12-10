package com.excelR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
public class Collection1 {
    public static void main(String[] args) {
        Collection<Integer>c1= new ArrayList<Integer>();
        System.out.println(c1.isEmpty());
        c1.add(10);
        c1.add(20);
        c1.add(12);
        System.out.println(c1); // [10,20,12]

        c1.remove(10);
        System.out.println(c1); // [20,12]
        System.out.println(c1.size()); // 3

        Boolean c=c1.contains(12);
        System.out.println(c);

//        c1.clear();
//        System.out.println(c1); // to clear all elements from array.


        System.out.println("==========================");
        Collection c2 = new ArrayList<Integer>(c1);
       c2.addAll(c1);
       System.out.println(c2);
       c2.remove(12);
       System.out.println(c2);
//       c2.removeAll(c1);
//       System.out.println(c2);

       System.out.println(c2.containsAll(c1));


        Collection <Integer>c3=new ArrayList<>(Arrays.asList(10,11,12,13));
        System.out.println(c3);

        Collection<Integer> c4 = new ArrayList<>(Arrays.asList(10,11,12,13,100,200,300, 400, 500));
        System.out.println(c4);
        c4.removeAll(c3);
//        System.out.println(c4);
//      c4.retainAll(c3);
//        System.out.println(c4);
Boolean b= c3.equals(c4);
System.out.println(b);


    }
}

