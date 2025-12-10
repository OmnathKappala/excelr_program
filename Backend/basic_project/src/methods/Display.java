package methods;

import java.util.Scanner;

public class Display {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount ba=new BankAccount();
		 
		 ba.setAccountHolder("Omnath");
		 ba.setAccountNumber(908764374l);
		 ba.setAccountType("savings");
		 ba.setBalance(1700);
		 ba.setBranchName("SBI");
		 ba.setIfscCode("SBIN000250");
		 ba.deposit(500);
		 ba.withdraw(1200);
		 ba.displayDetails();
		 ba.transfer(500, ba);
		 
	String display=	 ba.toString();
	System.out.println(display);
	 

//		BankAccount b = new BankAccount(123456, "omnath", 500, "saving", "2345BrSbi", "SBI");
//		BankAccount c = new BankAccount(123456, "Surya", 2000, "saving", "2345BrSbi", "SBI");
//		// TODO Auto-generated method stub
//		System.out.println(b);
//		b.transfer(1000, c);
//		b.deposit(1000);
//		b.withdraw(100);
//		System.out.println(b);
//		System.out.println(c);
//		b.displayDetails();

	}

}
