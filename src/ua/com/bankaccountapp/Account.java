package ua.com.bankaccountapp;

public abstract class Account implements IBaseRate {
	// List common properties for savings and checking accounts
	String name;
	String socialSecurityNumber;
	double balance;
	
	String accountNumber;
	double rate;
	
	
	// Constructor to set base properties and initialize the account
	public Account(String name, String socialSecurityNumber, double balance) {
		this.name = name;
		this.socialSecurityNumber = socialSecurityNumber;
		this.balance = balance;
		System.out.println(name + " " + socialSecurityNumber + " " + balance);
	}
	// List common methods
	
}
