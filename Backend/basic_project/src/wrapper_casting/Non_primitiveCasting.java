package wrapper_casting;

public class Non_primitiveCasting {
	public static void main(String[] args) {
		// storing child in parent
		Father father=new Son();// implict -- UpCasting
		System.out.println(father);
		
		// checking parent reference consist of son object
		if(father instanceof Son) {
		//	converting parent to child
			Son son=(Son) father;
			System.out.println(son);
			
		}
		// checking parent reference consist of daughter object
		if(father instanceof Daughter) {
			// in father ref daughter object ids not  exist  so,ClassCAstExpection will occur.
			Daughter d=(Daughter) father;
			System.out.println(d);
		}
	}

}











class Father{
	public void method() {
		System.out.println("Father Method");
		
	}
}





class Son extends Father{
	@Override
	public void method() {
		System.out.println("Son Method");
		// TODO Auto-generated method stub
		super.method();
	}
	
}


class Daughter extends Father{
	@Override
	public void method() {
		System.out.println("Daughter Method");
		// TODO Auto-generated method stub
		super.method();
	}
	
}