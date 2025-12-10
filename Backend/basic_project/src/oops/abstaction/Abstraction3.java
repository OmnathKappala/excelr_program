package oops.abstaction;

public class Abstraction3 {
	

	public static void main(String[] args) {
		Developer d = new Developer("Java");
	System.out.println(d.toString());
	
	Developer d1 = new Developer("Java",5);
	System.out.println(d1.toString());
	
	Developer d3 = new Developer("Java",5,"omna@gmail.com");
	System.out.println(d3.toString());
	
	Developer d4 = new Developer("Java",5,"omna@gmail.com",7386201900l);
	System.out.println(d4.toString());
		// TODO Auto-generated method stub
	
	Employee employee=new Developer("omnath","omnath@gmail",8948449l);
	employee.project();
	
		

	}

}
 abstract class Employee{
	String name;
	String email; 
	long phone;
	
	



	public Employee(String name, String email, long phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	public  void project() { 
		
		
		System.out.println("Employee [name=" + name + ", email=" + email + ", phone=" + phone + "]"
	);
	}
		
	


	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}
	
}
 class Developer extends Employee{
	 String language;
	 int exp;
	 String email;
	 long phone;
	 @Override
	 public String toString() {
		return "Developer [language=" + language + ", exp=" + exp + ", email=" + email + ", phone=" + phone + "]";
	 }
	 public Developer(String language) {
//		super();
		this.language = language;
	 }
	 public Developer(String language, int exp) {
//		super();
//		this.language = language;
		 this(language);
		this.exp = exp;
	 }
	 public Developer(String language, int exp, String email) {
//		super();
//		this.language = language;
//		this.exp = exp;
		 this(language,exp);
		this.email = email;
	 }
	 public Developer(String language, int exp, String email, long phone) {
//		super();
//		this.language = language;
//		this.exp = exp;
//		this.email = email;
		 this(language,exp,email);
		this.phone = phone;
	 }
	 public Developer() {
		super();
		// TODO Auto-generated constructor stub
	 }
	 public Developer(String name, String email, long phone) {
		super(name, email, phone);
		// TODO Auto-generated constructor stub
	 }
	 @Override
	 public void project() {
		// TODO Auto-generated method stub
		super.project();
	 }
	 
	 
	 
	 
	 
	 
	 
 }

