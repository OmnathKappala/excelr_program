package com.excelR.setPrograms;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetProgram1 {
    public static void main(String[] args) {
     Set<String> set;
//        set=new HashSet<String>();
//        set.add("apple");
//        set.add("Pears");
//        set.add("Pears");
//        set.add("null"); // maintain unorder either instersion and sorting order.
//
////        System.out.println(set+" hashSet");
//
//        set=new LinkedHashSet<>();
//        set.add("apple");
//        set.add("Pears");
//        set.add("Pears");
//        set.add("null"); // accept null values and maintain inserstion order .
////        System.out.println(set+" Linked hashSet");


        set=new TreeSet<String>();
        set.add("Apple");
        set.add("Banana");
        set.add("Pears");
        set.add("orange");
        set.add("mango");
//        set.add(null);   null values don't accept in tree set and maintain sorting order.
        System.out.println(set+"  TreeSet");

    }
}
