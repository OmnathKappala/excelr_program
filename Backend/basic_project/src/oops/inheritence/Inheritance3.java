package oops.inheritence;

public class Inheritance3 {

	public static void main(String[] args) {
		Father father=new Father();
		father.m1(); // non static 
		father.m3(); // non static
		father.m2();  // static
		
		System.out.println("=========================");
		
		father=new Son();// -- child object
		father.m1(); //  non static -- child implemenation
		father.m2();  // static -- parent implemenation
		
		// TODO Auto-generated method stub

	}

}
class Father{
	private void privateMethod() {
		System.out.println("private Method");
		
	}
	void m1() {
		System.out.println("m1 default method");
	}
	static void m2() {
		System.out.println("m2 method");
	}
	public final void m3() {
		System.out.println("m3 is a final method");
	}
	
}
class Son extends Father{
	@Override
	 public void m1() { // visibility can be more or equal to parent methods 
		// TODO Auto-generated method stub
		super.m1(); 
	}
	static void m2() {
		System.out.println("m2 static child method");
		
	}
	
}