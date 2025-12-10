package oops.inheritence;

public class Inheritence2 {

	public static void main(String[] args) {
		Animal animal=new Animal();
		animal.eats();
		
		Dog dog=new Dog();
		dog.eats();
		// TODO Auto-generated method stub

	}

}

class Animal{
	public void eats() {
		System.out.println("animal is eating........");
	}
}
class Dog extends Animal{

	@Override
	public void eats() {
		// TODO Auto-generated method stub
		super.eats();
	}
//	@Override
//	public void eats() {
//		// TODO Auto-generated method stub
//		super.eats();
//		System.out.println("Dog eats meat");
//	}
}
