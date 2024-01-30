package com.train.booking;

import java.util.LinkedList;
import java.util.List;

public class Test {
	
	
public static void main(String[] args) {
	
	
	BankAccount b1=new BankAccount(377504423, 20000);
	
	
	Passenger p1= new Passenger(1, "Ram", 25, b1);
	Passenger p2= new Passenger(2, "Rohit", 23, b1);
	Passenger p3= new Passenger(3, "Rudra", 21, b1);
	
	List<Passenger> passenger = new LinkedList<>();
	passenger.add(p1);
	passenger.add(p2);
	passenger.add(p3);
	
	TrainService.BookTicket(101, passenger);
	
	TicketService.showTicketDetails(1);
	
	
	
	
	
}

}
