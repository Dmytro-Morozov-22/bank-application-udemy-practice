package ua.com.bankaccountapp;

public abstract class Account implements IBaseRate {
	// List common properties for savings and checking accounts
	String name;
	String socialSecurityNumber;
	double balance;
	
	static int index = 10000;
	String accountNumber;
	double rate;
	
	
	// Constructor to set base properties and initialize the account
	public Account(String name, String socialSecurityNumber, double balance) {
		this.name = name;
		this.socialSecurityNumber = socialSecurityNumber;
		this.balance = balance;
		
		// Set account number
		index++;
		this.accountNumber = setAccountNumber();
		setRate();
	}
	
	public abstract void setRate();
	
	private String setAccountNumber() {
		int length = socialSecurityNumber.length();
		String lastTwoOfSocialSecurityNumber = socialSecurityNumber.substring(length-2, length);
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSocialSecurityNumber + uniqueID + randomNumber;
	}
	
	// List common methods - transactions
	public void deposit(double amount) {
		this.balance = balance + amount;
		System.out.println("Depositing $" + amount);
		printBalance();
	}
	
	public void withdraw(double amount) {
		this.balance = balance - amount;
		System.out.println("Withdrawing $" + amount);
		printBalance();
	}
	
	public void transfer(String toWhere, double amount) {
		this.balance = balance - amount;
		System.out.println("Transfering $" + amount + " to " + toWhere);
		printBalance();
	}
	
	public void printBalance() {
		System.out.println("Your balance is now: $" + balance);
	}
	
	public void showInfo() {
		System.out.println(
				"NAME: " + name + 
				"\nACCOUNT NUMBER: " + accountNumber + 
				"\nBALANCE: " + balance + 
				"\nRATE: " + rate + "%"
				);
	}
	
}
