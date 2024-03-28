package com.accounts.oops;

//Account class (Base Class)
class Account {
	protected double balance;
	protected double interestRate;

	public Account(double balance, double interestRate) {
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public void calculateInterest() {
		double interest = balance * interestRate / 100;
		balance += interest;
		System.out.println("Interest calculated and added to account: " + interest);
	}

	public double getBalance() {
		return balance;
	}
}
