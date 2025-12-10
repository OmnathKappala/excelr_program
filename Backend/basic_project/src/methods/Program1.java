package methods;

public class Program1 {
	 int instanceVariable;
	 static String staticVariable;
	 static {
		 System.out.println("static initilizer");
		 
	 }
	 {
		 System.out.println("non static initlizier");
	 }
	 public void instanceMethod() {
		 System.out.println("instance Method");
	 }
	 public static void staticMethod() {
		 System.out.println("static method");
	 }
	 
//	 public static void m1() {
//		 System.out.println(staticVariable);
//		 staticMethod();
//		 Program1 program1 = new Program1();
//		 program1.instanceMethod();
//	 }
//	 public void m2() {
//		 System.out.println("instance variable");
//		 System.out.println(staticVariable);
//		 staticMethod();
//		 instanceMethod(); 
//	 }

	public static void main(String[] args) {
		Program1 p1= new Program1();
		Program1 p=new Program1();
		 staticMethod();
		 staticMethod();
		 p1.instanceMethod();
		 p1.instanceMethod();
		 
		 System.out.println(p1.instanceVariable);
		 System.out.println(p1.instanceVariable);
		 
		 System.out.println(staticVariable);
		 System.out.println(staticVariable);
		 
		// TODO Auto-generated method stub
		

	}

}

/*
 * Excepted o/p-- null staticMethod null staticMethod 0 instanceMethod 0 instanceMethod
 * 
 * Actual o/p--static intilizers
 *               null staticMethod null staticMethod
 *              non static intilizers
 *              0 instanceMethod
 *              non static intilizers
 *              0 instanceMethod 
 */
