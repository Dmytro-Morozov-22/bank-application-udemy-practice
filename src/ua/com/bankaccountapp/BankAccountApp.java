package ua.com.bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<>();
		
		String file = "src/ua/com/utilities/files/NewBankAccounts.csv";
	
		List<String[]> newAccountHolders = ua.com.utilities.CSV.read(file);
		for(String[] accountHolder : newAccountHolders) {
		
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			if(accountType.equals("Savings")) {
				accounts.add(new Savings(name, sSN, initDeposit));
			} else if (accountType.equals("Checking")) {
				accounts.add(new Checking(name, sSN, initDeposit));
			} else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
			
		}
		
		for(Account acc : accounts) {
			acc.showInfo();
			System.out.println("---------------------------------");
		}
			
	}

}
