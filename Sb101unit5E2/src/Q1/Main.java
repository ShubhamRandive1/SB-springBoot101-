package Q1;

import java.util.*;

import java.lang.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TicketCounter ticketcount= new TicketCounter();
		
		
		System.out.println("enter the no of ticket you want to book");
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int len = sc.nextInt();
		
		for(int i=0;i<len;i++) {
			
			System.out.println("Enter your name");
			
			String yourName = sc.next();
			
			System.out.println("Enter the no of seats want to book");
			
			int numberOfSeats = sc.nextInt();
			
			
			TicketBooking tickets = new TicketBooking(ticketcount, yourName, numberOfSeats);
		
			
			tickets.start();
		}
		
	

	}

}
