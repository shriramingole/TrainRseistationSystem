package com.train.booking;

public class Passenger {

	private int passengerId;
	private String passengerName;
	private int age;
	private BankAccount bankaccount;

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public BankAccount getBankaccount() {
		return bankaccount;
	}

	public void setBankaccount(BankAccount bankaccount) {
		this.bankaccount = bankaccount;
	}

	public Passenger() {
		super();
	
	}

	public Passenger(int passengerId, String passengerName, int age, BankAccount bankaccount) {
		super();
		this.passengerId = passengerId;
		this.passengerName = passengerName;
		this.age = age;
		this.bankaccount = bankaccount;
	}

	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", passengerName=" + passengerName + ", age=" + age
				+ ", bankaccount=" + bankaccount + "]";
	}

}
