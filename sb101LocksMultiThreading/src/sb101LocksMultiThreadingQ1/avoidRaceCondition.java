package sb101LocksMultiThreadingQ1;


public class avoidRaceCondition implements Runnable{
		
	int count = 0;
		
	public void CountIncrement() {
			
		try {
				
			Thread.sleep(100);
				
		}catch(Exception ex) {
			
			ex.printStackTrace();
			}
			
			count++;
		}
		
		public void CountDecrement() {
			
			count--;
		}
		
		public int getValue() {
			
			return count;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			synchronized(this) {
			
			this.CountIncrement();
			
			System.out.println("Incremented counter to "+this.getValue()+" The Current thread is "+" "+Thread.currentThread().getName());
			
			this.CountDecrement();
			
			System.out.println("Decremented counter to "+this.getValue()+" The Current thread is "+" "+Thread.currentThread().getName());
			
		}
	}
		
		

}




