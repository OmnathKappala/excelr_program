package com.excelR.ListProgram;

import java.util.ArrayList;
import java.util.*;
public class StudentMain {
    public static void main(String[] args) {
        List<Student>list=new ArrayList<Student>();

        list.add(new Student("Balu",98.9));
        list.add(new Student("Karan",99.9));
        list.add(new Student("Jack",99.9));
        list.add(new Student("Rani",97.9));
        list.add(new Student("Omnath",100.00));
        System.out.println(list);
         Collections.sort(list);
         System.out.println(list);
//         list.sort((s1,s2)->{
//             return s1.compareTo(s2);
//         });
//         System.out.println(list);
    }
}
