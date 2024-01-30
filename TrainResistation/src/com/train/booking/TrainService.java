package com.train.booking;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class TrainService {

	private static List<Train> allTrains = new LinkedList<>();

	static {

		allTrains.add(new Train(101, "Train-1", "Pune", "Mumbai", 200, 350, LocalDate.now()));
		allTrains.add(new Train(102, "Train-2", "Mumbai", "Pune", 100, 200, LocalDate.now()));
		allTrains.add(new Train(103, "Train-3", "Pune", "Nashik", 120, 400, LocalDate.now()));
		allTrains.add(new Train(104, "Train-4", "Nashik", "Mumbai", 320, 250, LocalDate.now()));

	}

	public static Train findTrain(int trainNumber) {

		Train temp = null;

		for (Train t : allTrains) {

			if (t.getTrainNumber() == trainNumber) {

				temp = t;
				System.out.println(temp);
				break;

			}

		}

		return temp;

	}

	public static void serchTrainBetweenStation(String fromStation, String toStation) {

		List<Train> serchTrain = new LinkedList<>();

		for (Train t : allTrains) {

			if (t.getFromStation().equals(fromStation) && t.getToStation().equals(toStation)) {

				serchTrain.add(t);

			}

		}
		if (serchTrain.size() == 0) {

			System.out.println("Sorry, no matching trian avilable for the serch critria");
		} else {

			System.out.println("tr.NO\t  trainName\t  FromStation\t   toStation\t  SeatAvailable\t fare\t  doj\t ");

			System.out.println("----------------------------------------------------------------------------------");

			for (Train t : serchTrain) {

				System.out.println(t.getTrainNumber() + "     " + t.getTrainName() + "           " + t.getFromStation()
						+ "              " + t.getToStation() + "          " + t.getSeatsAvailabel() + "          "
						+ t.getFare() + "    " + t.getDoj());
			}
		}

	}

	public static void BookTicket(int trainNumber, List<Passenger> passengerList) {

		int numOfSeats = passengerList.size();

		BankAccount bankaccount = passengerList.get(0).getBankaccount();

		Train tempTrain = findTrain(trainNumber);

		int fare = tempTrain.getFare();

		int totalfare = fare * numOfSeats;

		bankaccount.withdraw(totalfare);

		tempTrain.setSeatsAvailabel(tempTrain.getSeatsAvailabel() - numOfSeats);
		
		
		TicketService.addNewTicket(trainNumber, passengerList);

	}

}
