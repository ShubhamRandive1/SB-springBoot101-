package sb101LocksMultiThreadingQ1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Counter countNumber = new Counter();
		
		Thread firstThread = new Thread(countNumber,"First ");
		
		Thread secondThread = new Thread(countNumber," Second ");
		
		
		firstThread.start();
		
		secondThread.start();

	}

}
