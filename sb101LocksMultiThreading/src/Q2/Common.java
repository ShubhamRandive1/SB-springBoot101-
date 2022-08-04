package Q2;

public class Common implements Runnable{
	
	
	public void fun1(String name) {
		
		synchronized(Common.class) {
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Inside function 1 of common");
		
		}
		
		System.out.println(name);
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		fun1("");
		
		System.out.println("the thread is "+Thread.currentThread().getName());
		
	}
	

}
