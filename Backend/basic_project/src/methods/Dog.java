package methods;

public class Dog {
	String breed, color,gender,name;
	int age;
	double height,weight;
	public static void barking() {
		System.out.println("barking");
		
	}
	public void eating() {
		System.out.println(name+" eats meat");
	}

	public static void main(String[] args) {
		// TODO Abaruto-generated method stub
         barking();
         Dog d=new Dog();
         d.age=15;
         d.eating();
         
         Dog dog=new Dog();
         System.out.println(dog);
         
         d.name="Chintu";
         System.out.println(d.name);
         System.out.println(dog.breed);
         dog.eating();
          Dog dog2= new Dog();
          System.out.println(dog2.name);
          System.out.println(dog2.breed);
          dog2.eating();
          System.out.println(dog2);
         
	}

}
 