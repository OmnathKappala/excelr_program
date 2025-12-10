package methods;

public class BankAccount {
	
	private long accountNumber;
	private String accountHolder;
	private double balance;
	private String accountType;
	private String IfscCode;
	private String branchName;
	 
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", balance="
				+ balance + ", accountType=" + accountType + ", IfscCode=" + IfscCode + ", branchName=" + branchName
				+ "]";
	}
//	public BankAccount(long accountNumber, String accountHolder, double balance, String accountType, String ifscCode,
//			String branchName) {
//		super();
//		this.accountNumber = accountNumber;
//		this.accountHolder = accountHolder;
//		this.balance = balance;
//		this.accountType = accountType;
//		IfscCode = ifscCode;
//		this.branchName = branchName;
//	}
	public   void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("money deposit is" + balance);
		}

		else {
			System.out.println("check accountNumber");
		}
	}

	public void withdraw( int amount) {
		if (balance > 0) {
			balance-= amount;
			System.out.println("Your current balance is" +this.balance);

		} else {
			System.out.println("check balance");
		}
	}

 public void transfer(int amount, BankAccount receiver) {
		if(amount>this.balance) {
			System.out.println("insuffient balance"+this.balance);
		}
		
		else if (amount > 0) {
			this.balance -= amount;
			receiver.balance += amount;
			System.out.println(amount + "transferred from " + this.accountHolder + "to " + receiver.accountHolder);
		}
	
		else {
			System.out.println("amount not transfered");
		}

	}
	public  void displayDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Type: " + accountType);
//        System.out.println("Branch Code: " + branchCode);
        System.out.println("Balance: ₹" + balance);
    }
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getIfscCode() {
		return IfscCode;
	}
	public void setIfscCode(String ifscCode) {
		IfscCode = ifscCode;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
	

	 
	 
	

}
