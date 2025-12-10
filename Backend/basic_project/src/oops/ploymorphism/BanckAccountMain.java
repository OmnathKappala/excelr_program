package oops.ploymorphism;

public class BanckAccountMain {

	public static void main(String[] args) {
		Bankaccount account=new Bankaccount();
		account.moneyTransfer(8346383471l, 32476341, 1234, 700);
		
		account.moneyTransfer(8346383471l, "omnath73@ybl", 1234, 134);
		
		
		account.moneyTransfer(8346383471l, 32476341, "SBIN000250", 1234, 1700);
		
		
		
		// TODO Auto-generated method stub

	}

}
