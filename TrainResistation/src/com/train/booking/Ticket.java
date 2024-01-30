package com.train.booking;

import java.util.List;

public class Ticket {

	private int pnr;
	private Train bookedTrain;
	private List<Passenger> passengerList;

	public int getPnr() {
		return pnr;
	}

	public void setPnr(int pnr) {
		this.pnr = pnr;
	}

	public Train getBookedTrain() {
		return bookedTrain;
	}

	public void setBookedTrain(Train bookedTrain) {
		this.bookedTrain = bookedTrain;
	}

	public List<Passenger> getPassengerList() {
		return passengerList;
	}

	public void setPassengerList(List<Passenger> passengerList) {
		this.passengerList = passengerList;
	}

	public Ticket() {
		super();
	
	}

	public Ticket(int pnr, Train bookedTrain, List<Passenger> passengerList) {
		super();
		this.pnr = pnr;
		this.bookedTrain = bookedTrain;
		this.passengerList = passengerList;
	}

	@Override
	public String toString() {
		return "Ticket [pnr=" + pnr + ", bookedTrain=" + bookedTrain + ", passengerList=" + passengerList + "]";
	}

}
