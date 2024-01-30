package com.train.booking;

public class BankAccount {

	private int accNumber;
	private int actBalance;

	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public int getActBalance() {
		return actBalance;
	}

	public void setActBalance(int actBalance) {
		this.actBalance = actBalance;
	}

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankAccount(int accNumber, int actBalance) {
		super();
		this.accNumber = accNumber;
		this.actBalance = actBalance;
	}

	@Override
	public String toString() {
		return "BankAccount [accNumber=" + accNumber + ", actBalance=" + actBalance + "]";
	}

	public void deposit(int amount) {
		actBalance = actBalance + amount;

	}

	public void withdraw(int amount) {

		actBalance = actBalance - amount;
	}

}
