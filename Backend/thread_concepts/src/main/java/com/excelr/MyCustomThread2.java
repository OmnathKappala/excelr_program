package com.excelr;

public class MyCustomThread2 extends Thread {
    @Override
    public void run() {
         System.out.println("My CustomThread2 run method");
    }

    public static void main(String[] args) {
        Thread r=new MyCustomThread2(); // new phase
        System.out.println(r);
//        r.run();
        r.start(); // --> start runs() make new phase to Runnable method.
    }
}
