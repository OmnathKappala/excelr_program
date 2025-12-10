package wrapper_casting;

public class NonPrimitiveCasting2 {

	public static void main(String[] args) {
		
		 Father f=new Father();
		 parentmethod(f);
		 parentmethod(new Son());// UpCasting
		 parentmethod(new Daughter());// UpCasting
		 Father f1=new Son();
		 parentmethod(f1);
		 
		 System.out.println("=================================");
		 System.out.println("");
		 System.out.println("===============================");
		 
		 childMethod(new Son());
		 Father father=new Son();// upCAsting
		 if(f1 instanceof Son) {
			 childMethod((Son)f1);// DownCasting
		 }
		 Father f2=new Daughter(); // upCAsting
		 if(f2 instanceof Son) {
			 childMethod((Son)f2); // DownCasting
		 }
		 
	}
	public static void parentmethod(Father father) {
	System.out.println(father);	
	}
	public static void childMethod(Son son) {
		System.out.println(son);
	}

}

