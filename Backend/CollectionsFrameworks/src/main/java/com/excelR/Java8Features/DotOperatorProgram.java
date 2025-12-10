package com.excelR.Java8Features;
import java.util.*;

public class DotOperatorProgram {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>(Arrays.asList(10,20,30,40));
//
//        list.forEach(
//                (e)->System.out.println(e)
//
//        );
        list.forEach(System.out::println); // :: dot operator , reference calling . double dot operator.
    }
}
