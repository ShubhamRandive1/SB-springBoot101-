package Q3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		evenOddNumbers evenAndOdd = new evenOddNumbers();
		
		Thread t1 = new Thread(evenAndOdd);
		
		Thread t2 = new Thread(evenAndOdd);
		
		t1.start();
		
		t2.start();
		
		try {
		
		t1.join();
		
		t2.join();
		
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
