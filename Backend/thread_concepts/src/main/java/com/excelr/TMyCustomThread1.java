package com.excelr;

public class TMyCustomThread1 implements Runnable {

    @Override
    public void run() {
        System.out.println("MyCustomThread1 run method");
    }

    public static void main(String[] args) {
        Runnable r=new TMyCustomThread1();
        System.out.println(r);
        r.run();
    }
}
