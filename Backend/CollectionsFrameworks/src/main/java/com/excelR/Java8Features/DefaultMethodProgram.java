package com.excelR.Java8Features;

public class DefaultMethodProgram {

}
interface Demo{
    static void m2(){
        System.out.println("Static in Parent");
    }
    default void m3(){
        System.out.println("Default in Parent");
    }
}
class DemoChild implements Demo{
    @Override
    public void m3() {
         System.out.println("default method can override in child ," + " but default keyword will erase " + " it used to breakdown implemention chain with child");
    }
}
//class Demo{
//    public void m1(){
//       non static method allowed
//    }
//    public static void m2(){
//        static method allowed
//    }
//    default void m3(){
//       default method is not allowed in class
//    }
//}
