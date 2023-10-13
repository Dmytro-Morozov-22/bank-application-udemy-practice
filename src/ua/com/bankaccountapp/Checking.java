package ua.com.bankaccountapp;

public class Checking extends Account {
	// List properties specific to a Checking account
	long debitCardNumber;
	int debitCardPIN;
	
	// Constructor to initialize checking account properties
	public Checking (String name, String socialSecurityNumber, double initDeposit) {
		super(name, socialSecurityNumber, initDeposit);
		accountNumber = "2" + accountNumber;
		setDeditCard();
	}
	
	@Override
	public void setRate() {
		super.rate = getBaseRate() * 0.15;
	}	
	
	// List any methods specific to the checking account
	
	private void setDeditCard() {
		debitCardNumber = (long) (Math.random() * Math.pow(10, 12));
		debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
	}
	
	
	
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Your Checking Account Features" + 
				"\n Debit Card Number: " + debitCardNumber +
				"\n Debit Card PIN " + debitCardPIN
				);
	}
	
}
