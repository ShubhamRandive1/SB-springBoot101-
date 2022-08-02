package Q3;

public class myThreaddelay {
	
	public static void main(String[] args) {
		
		Thread myThread = new Thread(new MyPrintNumbers());
		
		myThread.start();
		
	}
}

class MyPrintNumbers implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
			
		for(int i = 1; i <= 10; i++) {
			
			try {
				if(i == 5) {
					Thread.sleep(5000);
					
					System.out.println(i);
				}else {
					System.out.println(i);
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	
}