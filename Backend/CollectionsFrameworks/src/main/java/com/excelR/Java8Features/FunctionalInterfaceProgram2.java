package com.excelR.Java8Features;

public class FunctionalInterfaceProgram2 {
    public static void main(String[] args) {
        Program2 p2 = () -> {
            return 0;
        };
        // for one line , we can ignore curly braces ,
        // if curly braces are not using return keyword is not necessary.
        Program2 p1=()-> 20+30;
        p1.m1();
        p2.m1();
    }
}
@FunctionalInterface
interface Program2{
    int m1();
}
