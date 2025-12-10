package methods;

import java.util.Scanner;

public class Calculator {
	
	public static void add(int a ,int b) {
		int add=a+b;
		System.out.println("Addition of " +a +" + "+ b+" is "+add);
	}
	public static void sub(int a ,int b) {
//		int sub=a+b;
		System.out.println("Sub of "+a+"-"+b+"is "+(a-b));
	}
	
	public static void mul(int a,int b) {
		int mul = a*b;
		System.out.println("Multiplication of "+a+"*"+b+"is "+mul);
		
	}
	
	public static void div(int a,int b) {
		int div = a/b;
		System.out.println("Division of "+a+"/"+b+"is "+div);
	}
	public static void mod(int a ,int b) {
		int mod = a%b;
		System.out.println("modulos of "+a+"%"+b+"is "+mod);
	}

	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter first value : ");
		int a=sc.nextInt();
		System.out.println("enter second value");
		int b= sc.nextInt();
		
		System.out.println("enter Operations(+,-,*./,%) : ");
		   
	char operations=sc.next().charAt(0);
	
	switch(operations) {
	case '+' :{
		add(a,b);
		
	}
	break;
	
	case '-':{
		sub(a,b);
		
	}
	break;
	
	case '*' :{
		mul(a,b);
		
		
	}
	break;
	
	case '/' :{
		div(a,b);
		
		
	}
	break;
	case '%' :{
		mod(a,b);
		
	}
	default : System.out.println("choose correct operations");
	
	}
	
	
	
	
	
	
	
	
	
	
	
	}
}
