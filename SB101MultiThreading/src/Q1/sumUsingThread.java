package Q1;

import java.util.*;

public class sumUsingThread {
	
	
	public static void main(String[] args) {
		
		Runnable myrunnable = new MyRunnable();
		
		Thread myRunnable = new Thread(myrunnable,"This is my thread");
		
		myRunnable.start();
		
		String myStr = myRunnable.getName();
		
		System.out.println(myStr);
		
	}

}


class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		long product = 1;
		
		for (int i = 1; i < 10; i++) {
			
			product *= i; 
			
		}
		
		System.out.println("Product from 1 to 10 is :"+" "+product);
		
	}
	
}