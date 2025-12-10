package oops.abstaction;

public class Shape {

	public static void main(String[] args) {
		Shape1 s=new Cricle(5);
		System.out.println(s.area());
		System.out.println(s.perimeter());
		
		s=new Rectangle(4,5);
	System.out.println(s.area());
		System.out.println(s.perimeter());
		// TODO Auto-generated method stub

	}

}


abstract class Shape1{
abstract	double area();
	abstract double perimeter();
	
}
   class Cricle extends Shape1{
	   double radius;
	   public Cricle(double radius) {
			super();
			this.radius = radius;
		}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI * (radius*radius);
	}

	@Override
	double perimeter() {
		// TODO Auto-generated method stub
		return 2* Math.PI * (radius*radius);
	}

	
	   
   }
	 class Rectangle extends Shape1{
		 double length;
		 double breadth;
		 
		 public Rectangle(double length, double breadth) {
				super();
				this.length = length;
				this.breadth = breadth;
			}

		@Override
		double area() {
			// TODO Auto-generated method stub
			return length*breadth;
		}

		@Override
		double perimeter() {
			// TODO Auto-generated method stub
			return  2 *(length+breadth);
		}

		

		 
		 
	 }
 
