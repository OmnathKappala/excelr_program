package com.excelr;

public class ThreadProgram1 {
    public static void main(String[] args) {
        Runnable r=()->{
            System.out.println("lambda expression which represents run method inside a runnable");

        };
        Thread t=new Thread(r);
        System.out.println(t);
        t.start();
    }
}
