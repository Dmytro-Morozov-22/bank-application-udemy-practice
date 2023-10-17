package ua.com.bankaccountapp;

import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		
		
		String file = "src/ua/com/utilities/files/NewBankAccounts.csv";
	
		List<String[]> newAccountHolders = ua.com.utilities.CSV.read(file);
		for(String[] accountHolder : newAccountHolders) {
		
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			System.out.println(name + " " + sSN + " " + accountType + " $" + initDeposit);
			if(accountType.equals("Savings")) {
				System.out.println("OPEN A SAVINGS ACCOUNT");
			} else if (accountType.equals("Checking")) {
				System.out.println("OPEN A CHECKING ACCOUNT");
			} else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
			
			
			
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
