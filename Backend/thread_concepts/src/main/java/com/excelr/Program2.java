package com.excelr;

public class Program2 {
    public static void main(String[] args) {
        Runnable r=()->{
            System.out.println(Thread.currentThread().getState());
            for(int i=0;i<=100;i++){
                System.out.print(i+" ");
            }

        };
//        r.run();

        Thread thread =new Thread(r);
        System.out.println(thread.getState());
        thread.start(); // start()--- run()

        // thread.stop();
    }

}


