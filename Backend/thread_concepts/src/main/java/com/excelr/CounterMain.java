package com.excelr;

public class CounterMain {
    public static void main(String[] args) throws InterruptedException {
        Counter counter=new Counter();
        Thread thread=new Thread(()->{
            for(int i=0;i<1000;i++){
                ;
                counter.increment();


            }

        });
        Thread thread2=new Thread(()->{
            for(int i=0;i<1000;i++){
                counter.increment();
            }
        });

        thread.start();
        thread2.start();
        thread.join();
        thread2.join();
        System.out.println(counter.getCounter()+" is count");
    }

}
class Counter{
    private int counter;
    public synchronized  void increment(){
        counter++;
    }
    public int getCounter(){

        return counter;
    }
}
