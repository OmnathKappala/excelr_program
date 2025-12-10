package com.excelR.Java8Features;
import java.util.*;
public class OptionalNullClassProgram2 {
    public static void main(String[] args) {
        Optional<Employee>emp =getEmployee();
        if(emp.isPresent()){
            System.out.println(emp.get().email);
        }

    }
    public static Optional<Employee> getEmployee(){
        return Optional.ofNullable(new Employee("omnath","omnath@gmail.com"));
    }
    public static Optional<Employee> getEmployee2(){
        return Optional.ofNullable(null);
    }
////         Employee emp=getEmployee();
////         System.out.println(emp);
//         Employee emp2=getEmployee2();
//         System.out.println(emp2);
//    }
//     public static Employee getEmployee(){
//        return new Employee("omnath","omnath@gmail.com");
//    }
//    public static Employee getEmployee2(){
//        return null;
//    }
}
class Employee{
    String name;
    String email;


    @Override
    public String toString() {
        return "Employee[" +
                "name='" + name + " " +
                ", email='" + email +  +
                ']';

    }
    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }

}
