package com.accounts.oops;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a SavingsAccount object
		SavingsAccount savingsAccount = new SavingsAccount(1000, 5);
		System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
		savingsAccount.calculateInterest();
		System.out.println("Updated Savings Account Balance: " + savingsAccount.getBalance());

		// Creating a CurrentAccount object
		CurrentAccount currentAccount = new CurrentAccount(2000, 3);
		System.out.println("Current Account Balance: " + currentAccount.getBalance());
		currentAccount.calculateInterest();
		System.out.println("Updated Current Account Balance: " + currentAccount.getBalance());

	}

}
