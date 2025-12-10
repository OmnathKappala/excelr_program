package com.excelR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIteration {
    public static void main(String[] args) {
        Collection<Integer> c4=new ArrayList<>(Arrays.asList(10,11,12,13,100,200,300, 400, 500));
        System.out.println(c4); // [10,11,12,13,100,200,300, 400, 500]

//        c4.forEach((e)->{
//            if(e%4==0){
//                c4.remove(e);
//            }
//
//        });
//        System.out.println(c4);


        Iterator<Integer> itr=c4.iterator();
        while(itr.hasNext()){
            int e=itr.next();
            if(e%4==0){
                itr.remove();
            }
        }
        System.out.println(c4);












        // for each loop /enchanced for loop / advanced for loop
//        for(int i:c4){
//            System.out.print(i+" ,");
//        }

//        // void accept(T,t)
//        Consumer<Integer>consumer=(Integer num)->{
//            System.out.println(num);
//        };
//        c4.forEach(consumer);
//
//        System.out.println("------------");
//        c4.forEach((Integer i)->{
//            System.out.print(i+" ,");
//        });

        // boolean test(T,t)
//        Predicate<Integer>p=(x)->{
//            return x%2==1;
//        };
//        c4.removeIf(p);
//
//        System.out.println(c4);


//        c4.removeIf((v)->{
//            return  v%2==1;
//
//
//        });
//        System.out.println(c4);








    }
}
