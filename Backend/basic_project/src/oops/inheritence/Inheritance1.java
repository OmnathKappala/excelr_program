package oops.inheritence;

public class Inheritance1 extends One {

	public static void main(String[] args) {
		Inheritance1 inheritance1=new Inheritance1();
		// inheritance1.privateVariable; // cannot access the private members.
		// TODO Auto-generated method stub

	}

}
class One{
	private String privateVariable="privateMember";
	
}
