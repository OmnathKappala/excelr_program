package com.excelR.ListProgram;

import java.util.*;

public class ListIterationProgram {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>(Arrays.asList(111,112,113,114,115,116,117,118,119,120,121,122,123,124));
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+",");
        }
        System.out.println();
        for(int i:list){
            System.out.print(i+",");
        }
        System.out.println();

        Iterator<Integer>itr=list.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+",");
        }
        System.out.println();

        ListIterator<Integer> itr2=list.listIterator();
        while(itr2.hasNext()){
            System.out.print(itr2.next()+",");

        }
        System.out.println();
        while(itr2.hasPrevious()){
            System.out.print(itr2.previous()+",");
        }
        System.out.println();
        list.forEach(
                (e)->{
                    System.out.print(e+",");
                }
        );
    }
}
