package com.excelR.ListProgram;

import java.util.ArrayList;
import java.util.List;

public class ListProgram1 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
//        list.add(2,"Orange");
        list.add("yellow");
        list.add(1,"RED");
        list.add(0,"Blue");
        list.addFirst("Green");
        list.addLast("Pink");
     // list .addAll(list2);
     //        list.add(0,list`);
        System.out.println(list);


        // update elements

        list.set(2,"Black");
        list.add(3,"Black");


        //acessing elements
        System.out.println(list.get(2));

//        System.out.println(list.get(12));   IOBE

        System.out.println(list.getFirst()); // green
        System.out.println(list.getLast()); // pink

//        finding index based on value
        System.out.println(list.indexOf("Black"));
        System.out.println(list.lastIndexOf( "Black"));
        System.out.println(list.indexOf("White"));


























//
      System.out.println(list);

        list.remove(2);
        list.removeFirst();
        list.removeLast();
        list.remove("Green");
        // list.removeAll();
         //        list.retainAll();
         //        list.removeIf();

         }
}
