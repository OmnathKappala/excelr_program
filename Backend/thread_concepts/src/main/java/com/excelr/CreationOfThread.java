package com.excelr;

public class CreationOfThread {
    public static void main(String[] args) {
        Runnable r=new Thread();
        System.out.println(r);
         Thread t=new Thread();
         System.out.println(t);
         t.setName("MyThread"); // re-initailize
         System.out.println(t);
         System.out.println(t.getName());

         Thread t1=new Thread("MyThread2"); // re-intailize while creating.
         System.out.println(t1);



    }
}
