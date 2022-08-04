package sb101LocksMultiThreadingQ1;

public class avoidRunConditionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		avoidRaceCondition avoidRun = new avoidRaceCondition();
		
		
		Thread avoidThreadOne = new Thread(avoidRun,"First one");
		
		Thread avoidThreadTwo = new Thread(avoidRun,"Second ");
		
		avoidThreadOne.start();
		
		avoidThreadTwo.start();

	}

}
