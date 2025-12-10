package methods;

public class Cat {
	String eyeColor;
	String name;
	double weight;
	@Override
	public String toString() {
		return "Cat [eyeColor=" + eyeColor + ", name=" + name + ", weight=" + weight + "]";
	}
	public Cat(String eyeColor, String name, double weight) {
		// Assigning local into global but both local and global are same to indicated global object members will use this keyword left side.
		super();
		this.eyeColor = eyeColor;
		this.name = name;
		this.weight = weight;
	}
	public Cat(String eyeColor, String name) {
		super();
		this.eyeColor = eyeColor;
		this.name = name;
	}
	

	 
}
