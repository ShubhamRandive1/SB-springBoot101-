package sb101day1assignmentQ1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.lang.*;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> stateToCapital = new HashMap<>();
		
		
		Scanner  sc = new Scanner(System.in);
		
		System.out.println("Enter the no of state/capital you want to add");
		
		int cityState = sc.nextInt();
		
		for (int i = 0; i < cityState; i++) {
			
			System.out.println("Enter the State");
			
			String state = sc.next();
			
			
			System.out.println("Enter the capital");
			
			String capital = sc.next();
			
			stateToCapital.put(state, capital);
			
			
			String choice = sc.next();
			
		}
		
		Set<String> stateAndCapital = stateToCapital.keySet();
		
		for(String capState : stateAndCapital) {
			
			System.out.println(capState+"-"+stateToCapital.get(capState));
		}
		
	}

}
