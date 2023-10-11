package ua.com.bankaccountapp;

public class Savings extends Account {
	// List properties specific to the Savings account
	int safetyDepositBoxID;
	int safetyDepositBoxKey;
	
	
	// Contructor to initialize settings for the Savings properties
	public Savings(String name, String socialSecurityNumber, double initDeposit) {
		super(name, socialSecurityNumber, initDeposit);
		System.out.println("NEW SAVINGS ACCOUNT");
	}
	// List any methods specific to savings account
}
