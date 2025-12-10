package com.excelr;

public class SleepPhase {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            System.out.println("thread is running");
            try{
                Thread.sleep(5000);

            }
            catch(InterruptedException e){}
            System.out.println("thread is finished running");
        });
        thread.start();


    }
}
