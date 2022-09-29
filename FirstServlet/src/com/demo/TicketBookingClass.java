package com.demo;

public class TicketBookingClass {

	static int seats = 100;

	static void seats() {
		if (seats > 0) {
			System.out.println("** Congratulations.** \n Seats Are Booked.  **");
			seats = seats - 2;

		} else {
			System.out.println("sorry... No seats Are Available.");
		}
	}
}