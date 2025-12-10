package com.excelr;

public class DeadLockExample {
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        Car2 car2 = new Car2();
        Thread thread=new Thread(()->{
           car1.run(car2);

        });
        Thread thread1=new Thread(()->{
            car2.run(car1);
        });
        thread.start();
        thread1.start();
    }
    /*
        car.runCar1();
        car1 running
        ego of car2

        car2.runCar2();
        car2 running
        ego of car1
     */
}


class Car1{
    public synchronized void run(Car2 car2){
        System.out.println("car1 is running");
        car2.ego(); // calling car 2 in car1
    }
    public synchronized void ego(){
        System.out.println("ego");
    }
}
class Car2{
    public synchronized void run(Car1 car1){
        System.out.println(" car2 is running");
        car1.ego(); // calling car1  in car2
    }
    public  synchronized  void ego(){
        System.out.println("ego");
    }
}
