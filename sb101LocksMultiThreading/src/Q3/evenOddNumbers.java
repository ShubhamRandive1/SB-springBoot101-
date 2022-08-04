package Q3;

public class evenOddNumbers implements Runnable{
	
	int odd[] = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	
	public void evenNumber() {
		
		for(int i = 0;i<20;i++) {
			
			if(odd[i]%2 == 0) {
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println(odd[i]);
			}
		}
		
	}
	
	int even[] = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	
	
	public void oddNumber() {
		
		for(int i=0;i<20;i++) {
			
			if(even[i]%2 !=0) {
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(even[i]);
				//System.out.println(even[i]);
			}
		}
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		synchronized(this) {
			
			System.out.println("thread name "+Thread.currentThread().getName());
			
			oddNumber();
			
			System.out.println("thread name "+Thread.currentThread().getName());
			
			evenNumber();
			
			
			
		}
		
	}
	
	

}
