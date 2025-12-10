package basic_project;

import java.util.Scanner;

public class Conditional1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your gender:");
		char gender = sc.next().charAt(0);
//		if(gender=='f'|| gender =='F') {
//			System.out.println("Female");
//		}
//		else if (gender=='m'||gender=='M') {
//			System.out.println("Male");
//		}
//		else {
//			System.out.println("Others");
//		}
//		
         switch(gender) {
         case 'f' : System.out.println("Female"); break;
         case 'F' : System.out.println("female");break;
         case 'm' : System.out.println("male"); break;
         case 'M' : System.out.println("male"); break;
         
         default : System.out.println("Other");
         
         }
         
		
		
	}

}
