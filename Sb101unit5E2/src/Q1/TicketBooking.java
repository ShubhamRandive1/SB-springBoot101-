package Q1;

public class TicketBooking extends Thread{
	
	private TicketCounter ticketCounter;
	
	private String passengerName;
	
	private int noOfSeats;

	public TicketBooking(TicketCounter ticketCounter, String passengerName, int noOfSeats) {
		
		this.ticketCounter = ticketCounter;
		this.passengerName = passengerName;
		this.noOfSeats = noOfSeats;
	}
	
	public void run() {
		
		try {
			
			ticketCounter.bookSeat(passengerName, noOfSeats);
			
		}catch(noSeatAvailableException ex) {
			
			System.out.println(ex);
		}
	}
	

}
