package com.train.booking;

import java.util.LinkedList;
import java.util.List;

public class TicketService {
	
  private static List<Ticket> allTickets=new LinkedList<>();
  
  public static void addNewTicket(int trainNumber, List<Passenger>passengerList) {
	  
	  int pnr=allTickets.size()+1;
	  
	 Train bookedTrain= TrainService.findTrain(trainNumber);
	 
	 allTickets.add(new Ticket(pnr, bookedTrain, passengerList));
	 
	 System.out.println("Tickets Booked Succesfully.....");
}
	
  public static void showTicketDetails(int pnr) {
	  
	  Ticket tempTicket=null;
	  
	  for(Ticket t:allTickets) {
		  
		  if(t.getPnr()==pnr) {
			  tempTicket=t;
			  break;
			  
		  }
		  
	  }
	  
	  System.out.println("PNR Number" +tempTicket.getPnr());
	  System.out.println(tempTicket.getBookedTrain().getFare()+tempTicket.getBookedTrain().getTrainName()+tempTicket.getBookedTrain().getFromStation()+tempTicket.getBookedTrain().getToStation()+tempTicket.getBookedTrain().getSeatsAvailabel());
	  System.out.println(tempTicket.getPassengerList());
  }
  
}
