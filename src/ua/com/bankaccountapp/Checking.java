package ua.com.bankaccountapp;

public class Checking extends Account {
	// List properties specific to a Checking account
	int debitCardNumber;
	int debitCardPIN;
	
	// Constructor to initialize checking account properties
	public Checking (String name, String socialSecurityNumber, double initDeposit) {
		super(name, socialSecurityNumber, initDeposit);
		accountNumber = "2" + accountNumber;
	}
	
	// List any methods specific to the checking account
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("ACCOUNT TYPE: Checking");
	}
	
}
