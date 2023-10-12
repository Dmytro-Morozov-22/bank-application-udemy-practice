package ua.com.bankaccountapp;

public class Savings extends Account {
	// List properties specific to the Savings account
	int safetyDepositBoxID;
	int safetyDepositBoxKey;
	
	
	// Constructor to initialize settings for the Savings properties
	public Savings(String name, String socialSecurityNumber, double initDeposit) {
		super(name, socialSecurityNumber, initDeposit);
		increamentAccountNumber();
	}
	
	private void increamentAccountNumber() {
		accountNumber = "1" + accountNumber;
		System.err.println("Accaunt number: " + this.accountNumber);
		System.out.println("NEW SAVINGS ACCOUNT");
	}
	
	// List any methods specific to savings account
}
