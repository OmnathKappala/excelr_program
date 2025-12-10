package com.excelR.ListProgram;


import java.util.*;

public class EmployeeMain {
    public static void main(String[] args) {

//        List<String>li=new ArrayList<>(Arrays.asList("Alice","Bob", "David","Carol"));
//        System.out.println(li);
//        Collections.sort(li); // ascending order.
//        System.out.println(li);


        List<Employee>list=new ArrayList<>();
        list.add(new Employee("Alice",345465654));
        list.add(new Employee("Emil" , 785434451 ));
        list.add(new Employee("Bob" , 785434452 ));
        list.add(new Employee("Carol" , 785434453 ));
        list.add(new Employee("David" , 785434456 ));
        list.add(new Employee("Carol" , 785434455 ));

        System.out.println(list);

        Comparator<Employee>comparator=(e1,e2)->{ // Operator is used to compare the Non primitive data type.
             int num = e1.name.compareTo(e2.name);
            if(num==0) {
                num = Long.compare(e1.phone, e2.phone);
            }
            return num;

        };

//        list.sort(comparator);
        Collections.sort(list,comparator);
        System.out.println(list);

    }

}
