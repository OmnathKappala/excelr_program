package com.excelr;

public class DemonThread {
    public static void main(String[] args) throws InterruptedException {
        Thread demon=new Thread(()->{
          while(true){
              System.out.println("Demon thread ");
              try{
                  Thread.sleep(1000);
              } catch (InterruptedException e) {

              }

          }

        });
        demon.setDaemon(true);
        demon.start();
        Thread nondemon=new Thread(()->{
            System.out.println("non Daemon thread is running");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {

            }
            System.out.println("non daemon thread is finished");

        });

        nondemon.start();
        nondemon.join();
    }
}
