package oops.abstaction;

public class Abstraction2 {
	

}


class Demo1{
	static int a;
	double d;
	public void m1() {
		
	}
	public Demo1(double d) {
		super();
		this.d = d;
	}
//	public abstract void m3() { // complete class won't allow abstract methods 
//		
//	}
}
 // we can't achevie 100% abstraction - it will accepts complete and incomplete methods(instance methods)
abstract class Demo2{
	static int a;
	double d;
	public void m1() {
		
	}
	public Demo2(double d) { // for constrctor chaning not for object creation.
		super();
		this.d = d;
	}
	public void m3() {
		
	}
	public static  void m6() {
		
	}
	public abstract void m4();
//  public  static void m5() {    abstract methods won't allow  abstract static methods  , and it will accept only instance variable . 
//	  
  } 
	interface  Demo3{
		void m3(); // public ,abstract
		int  a=10; // public static final varaiable
		// from java 8 -- can't override these 2 methods
		
		default void  m6() {
			
			
		}
	}
// it won't allow const,non static complete methods, non static variables

	
	
	
	
	
	
	
