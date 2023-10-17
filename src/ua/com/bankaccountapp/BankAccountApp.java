package ua.com.bankaccountapp;

import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		
		
		String file = "src/ua/com/utilities/files/NewBankAccounts.csv";
	
		List<String[]> newAccountHolders = ua.com.utilities.CSV.read(file);
		for(String[] accountHolder : newAccountHolders) {
			System.out.println("NEW ACCOUNT");
			System.out.println(accountHolder[0]);
			System.out.println(accountHolder[1]);
			System.out.println(accountHolder[2]);
			System.out.println(accountHolder[3]);
			System.out.println("---------------------");
		}
		
//		Checking chkacc1 = new Checking("Dmytro Morozov", "123456789", 1500);
//		Savings saveacc1 = new Savings("Olha Morozova", "987654321", 2500);
//
//		saveacc1.compound();
//		
//		saveacc1.showInfo();
//		System.out.println("---------------------------");
//		chkacc1.showInfo();
		
		
		
		
	}

}
