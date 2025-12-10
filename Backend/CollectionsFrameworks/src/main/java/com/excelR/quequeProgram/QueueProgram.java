package com.excelR.quequeProgram;

import java.util.LinkedList;
import java.util.Queue;

public class QueueProgram {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
//        System.out.println(queue.element());   NSEException q.peek();-null
//        q.remove() // nseexception q.poll()-null
        queue.add("one");
        queue.add("two");
        queue.add("three");
        queue.add("four");
        queue.add("five");
        System.out.println(queue);
        System.out.println(queue.element());

        queue.remove();//one
        System.out.println(queue);
        System.out.println(queue.element());
        queue.remove();
        System.out.println(queue);


        System.out.println(queue.poll());


        System.out.println(queue.peek());
    }
}
