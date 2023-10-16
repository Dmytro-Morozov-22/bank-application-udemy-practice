package ua.com.bankaccountapp;

public class BankAccountApp {

	public static void main(String[] args) {
		Checking chkacc1 = new Checking("Dmytro Morozov", "123456789", 1500);
		Savings saveacc1 = new Savings("Olha Morozova", "987654321", 2500);

		chkacc1.showInfo();
		System.out.println("---------------------------");
		saveacc1.showInfo();
		
		saveacc1.deposit(5000);
		saveacc1.withdraw(200);
		saveacc1.transfer("Brokerage", 3000);
		
	}

}
