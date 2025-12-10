package com.excelR.Java8Features;

import java.util.Optional;

public class OptionalClassProgram {
    public static void main(String[] args) {
//        int size=getName().length();

        Optional<String> res=getName();
//        if(res.isPresent()){
//            System.out.println(res+"if");
//
//        }
//        else{
//            System.out.println(res+"else if");
//        }
        if(res.isPresent()){
            String name =res.get();
            System.out.println(name.length());
        }
        else{
            System.out.println("can't find size for null values");
        }
    }
//    public static String getName(){
//        String name=null;
//        return name;
//    }

    public static Optional<String> getName() {
        String name = "Omnath";
//        return  Optional.of(String.valueOf(name));
            return Optional.ofNullable(name);

    }
}
