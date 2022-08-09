package Q2;

import java.util.*;
import java.util.concurrent.SynchronousQueue;
import java.lang.*;

public class Deadlock {
	
	public static Object deadLock1 = new Object();
	
	public static Object deadLock2 = new Object();
	
	
	private static class ThreadLocker1 extends Thread{
		
		@Override
		public void run() {
			
			synchronized (deadLock1) {
				
				System.out.println("First Thread is keeping lock lock");
				
				try {
					
					Thread.sleep(1000);
				}catch(Exception ex) {}
					
					System.out.println("First thread in queue , Thread Two Need to execute");
				
					
					synchronized (deadLock2) {
						
						System.out.println("First thread keeping both locks");
						
					}
				
			}
			
			
			
		}
		
		
	}
	
	
	private static class ThreadLocker2 extends Thread{
		
		@Override
		public void run() {
			
			synchronized (deadLock2) {
				
				synchronized (deadLock2) {
					
					System.out.println("Second Thread Is keeping lock");
					
					
					try {
						Thread.sleep(1000);
					}catch(Exception ex) {
						
						System.out.println("thread two is in queue");
					}
					
					System.out.println("Second thread is waiting for lock first thread");
					
					
					synchronized (deadLock1) {
						
						System.out.println("Second Thread keeping lock one and second");
						
					}
					
				}
				
			}
			
			
		}
	}
	
	
	public static void main(String[] args) {
		
		ThreadLocker1 t1 = new ThreadLocker1();
		
		ThreadLocker2 t2 = new ThreadLocker2();
		
		t1.start();
		
		t2.start();
		
		
	}

}
