package Q2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class mainThreadPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService executs = Executors.newFixedThreadPool(6);
		
		for(int i=0; i<10; i++) {
			
			Runnable newRunnable = new ThreadPoolExecutors(""+i);
			
			executs.execute(newRunnable);
		}
		
		executs.shutdown();
		
		
		while(!executs.isTerminated()) {
			
			System.out.println("running threads");
		}
		
		System.out.println("finished Threads Working");

	}

}
