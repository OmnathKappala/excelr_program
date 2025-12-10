package oops.inheritence;

public class SingleLevelInheritence {
	
	

	public static void main(String[] args) {
		System.out.println("------------parent class");
		Parent p= new Parent();
		System.out.println(p.parentValue); 
		System.out.println("-----------Child class");
		Child c =new Child();
		System.out.println(c.parentValue);
		System.out.println(c.ChildValue);
		// TODO Auto-generated method stub

	}

}

class Parent{
	String parentValue="ParentValue";
	
}

class Child extends Parent{
String ChildValue="ChildValue";	
}
