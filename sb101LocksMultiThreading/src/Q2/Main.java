package Q2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Common c = new Common();
		
		Thread t1 = new Thread(c);
		
		Thread t2 = new Thread(c);
		
		t1.start();
		
		t2.start();

	}

}
