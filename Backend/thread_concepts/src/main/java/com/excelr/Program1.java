package com.excelr;

public class Program1 { // Exception in thread "main" java.lang.NumberFormatException: For input string: "10f"
    public static void main(String[] args) {
        String s="10f";
        Integer i=Integer.valueOf(s);
        System.out.println(i);
    }
}
