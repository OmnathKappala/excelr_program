package methods;

public class MethodProgram1 {
         public static void m1() {
        	 System.out.println("m1 method");
         }
         public int m2() {
        	 return 10;
         }

	public static void main(String[] args) {
		m1();
		MethodProgram1 mp=new MethodProgram1();
		int res=mp.m2();
		System.out.println(res);
		// TODO Auto-generated method stub

	}

}