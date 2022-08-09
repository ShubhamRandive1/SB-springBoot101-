package Q2;

import java.util.*;

public class ThreadPoolExecutors implements Runnable{

	private String showMessage;
	
	public ThreadPoolExecutors(String string) {
		
		this.showMessage = string;
	}
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getName()+"The Start "+showMessage);
		
		displayMessage();
		
		System.out.println(Thread.currentThread().getName()+"Ending");
		
	}
	
	private void displayMessage() {
		
		try {
			Thread.sleep(1000);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
	

}
