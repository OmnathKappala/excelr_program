package com.excelR.Java8Features;

import java.util.Arrays;

public class StreamProgram1 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
//        for(int x:arr){
//            int res =x*5;
//            if(res%2==0){
//                System.out.println(res);
//            }
//        }

        Arrays.stream(arr)
                .map((e) -> e * 5)
                .filter((e) -> e % 2 == 0)
                .forEach(System.out::println);
    }
}
