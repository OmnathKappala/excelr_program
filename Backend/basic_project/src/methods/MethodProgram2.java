package methods;

public class MethodProgram2 {
	
	public static void m1() {
		System.out.println("m1 method");
	}
	
	public static void m2(int a) {
		System.out.println("m2 method"+ a);
	}

	public static void main(String[] args) {
		
		m1();
		
		int i=10;
		m2(i);
		
		byte b=10;
		m2(b);
		
		long g=10098764321l;
		m2((int)g);
		// TODO Auto-generated method stub

	}

}
