package methods;

public class Mobile {
	int storge;
	String brand;
	double price;
	int pixcels;
	double weight;
	@Override
	public String toString() {
		return "Mobile [storge=" + storge + ", brand=" + brand + ", price=" + price + ", pixcels=" + pixcels
				+ ", weight=" + weight + "]";
		
		 
	}
	
	
	 public Mobile() {
		 System.out.println("deafult const----no args");
	 }
	public Mobile(String brand) {
		System.out.println("user defined const --1 args");
		this.brand=brand;
	}
	public Mobile(int storage,String brand) {
		System.out.println("use defined const --2 args");
		this.storge=storage;
		this.brand=brand;
	}
	
	public Mobile(int storge ,
	String brand,
	double price,
	int pixcels,
	double weight) {
		System.out.println("use all arguments");
		this.brand=brand;
		this.pixcels=pixcels;
		this.storge=storge;
		this.price=price;
		this.weight=weight;
	}
	
	
	
	
			

}
