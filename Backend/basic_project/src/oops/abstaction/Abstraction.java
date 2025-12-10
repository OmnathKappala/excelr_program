package oops.abstaction;

import java.util.ArrayList;
import java.util.List;

abstract class Person{  // abstract class /incomplete class
	public abstract void browsing();
}
class PersonChild extends Person{ // concrete class

	@Override
	public void browsing() { // concrete /implemented method
		// TODO Auto-generated method stub
		System.out.println("Browsing java oops concept");
		
	}
	
}








public class Abstraction {
	public static void main(String[] args) {
//		Person p=new Person(); // stroing child object in parent reference
		Person p=new PersonChild(); // stroing child object in parent reference
		p.browsing(); // calling parent abstract method
		List list= new ArrayList();
	}

}
