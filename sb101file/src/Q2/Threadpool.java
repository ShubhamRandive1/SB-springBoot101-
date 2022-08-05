package Q2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadpool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService executs = Executors.newFixedThreadPool(2);
		
		for(int i=0; i<5; i++) {
			
			Runnable Worker = new workingThread("Thread "+i);
			
			executs.execute(Worker);
		}
		
		executs.shutdown();
		
		while(!executs.isTerminated()) {
			
		}
		
		System.out.println("Finish");

	}

}
