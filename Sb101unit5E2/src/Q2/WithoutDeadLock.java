package Q2;

import java.util.*;

import java.lang.*;


class Threadone{
	
	public synchronized void last(){
		
		System.out.println("Thread one method one");
		
	}
	
	public synchronized void method2 (ThreadTwo two) {
		
		
		System.out.println("Thread one start the method2 execution");
		
		
		try {
			Thread.sleep(1000);
		}catch(Exception ex) {
			System.out.println(ex);
		}
		
		System.out.println("Thread one call thread two method one");
		
		
		two.last();
		
	}
	
	
}

class ThreadTwo{
	
	
	
	public void last() {
		
		System.out.println("Thread two method two");
	}
	
	public void method2(Threadone one) {
		
		
		System.out.println("Thread second running method 2 of Threadtwo");
		
		try {
			
			Thread.sleep(1000);
		}catch(Exception ex) {
			
			System.out.println(ex);
		}
		
		System.out.println("Thread second calling Threadone last method");
		
		one.last();
	}
	
}

public class WithoutDeadLock extends Thread{
	
	
	
	Threadone one = new Threadone();
	
	ThreadTwo two = new ThreadTwo();
	
	
	public void method1() {
		
		this.start();
		
		one.method2(two);
	}
	
	public void method2() {
		
		this.start();
		
		two.method2(one);
	}

	public static void main(String[] args) {
		
		
		WithoutDeadLock noDeadLocking = new WithoutDeadLock();
		
		noDeadLocking.method1();
		
	}
	

}

