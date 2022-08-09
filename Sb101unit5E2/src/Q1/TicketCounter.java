package Q1;

public class TicketCounter {
	
	int availableSeats = 3;
	
	public synchronized void bookSeat(String passengerName,int numberOfSeats)throws noSeatAvailableException{
		
		try {
		if((availableSeats >= numberOfSeats) && numberOfSeats >0) {
			
			System.out.println("Mr/Ms "+passengerName+" "+numberOfSeats+" booked");
			
			availableSeats = availableSeats-numberOfSeats;
		}
	}catch(Exception ex) {
		
		throw new noSeatAvailableException("no seats");
	}
		}

}
