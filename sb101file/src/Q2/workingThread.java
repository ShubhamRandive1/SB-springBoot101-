package Q2;

public class workingThread implements Runnable{
	
	private String message;
	
	
	public workingThread(String s) {
		
		this.message = s;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getName()+" Started"+" "+message);
		
		printMessage();
		
		System.out.println(Thread.currentThread().getName()+" Ended");
		
	}
	
	private void printMessage() {
		
		try {
			
			Thread.sleep(1000);
			
		}catch(Exception ex) {
			
			ex.printStackTrace();
		}
	}

}
