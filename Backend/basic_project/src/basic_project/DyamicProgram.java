package basic_project;

import java.util.Scanner;

public class DyamicProgram {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your name");

		String name=sc.next();
		
		System.out.println("enter your name");
		String email=sc.nextLine();
		
		System.out.println("your phone number");
		long phone=sc.nextLong();
		
		
		System.out.println("enter age");
		int age = sc.nextInt();
		
		System.out.println("enter gender"); 
		char gender=sc.next().charAt(0);
		
		
		System.out.println("enter adress");
		String address=sc.nextLine();
		
		sc.next();
		
		
		
		System.out.println("Enter your salary");
		double salary=sc.nextDouble();
		
		System.out.println("enter status");
		boolean martialstatus=sc.nextBoolean();
		
		System.out.println("Name :"+name);
		
		System.out.println("Email:"+email);
		
		System.out.println("phone :"+phone);
		
		System.out.println("gender :"+gender);
		
		System.out.println("Address :"+address);
		
		System.out.println("Salary:"+salary);
		 
		System.out.println("status :"+ martialstatus);
		
		
		
		// TODO Auto-generated method stub

	}

}
