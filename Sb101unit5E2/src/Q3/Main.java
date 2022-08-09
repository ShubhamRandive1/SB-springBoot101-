package Q3;

import java.util.*;
import java.util.stream.Collectors;
import java.lang.*;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		List<Students> studentAdd = new ArrayList<>();
		
		
		System.out.println("enter the number of student");
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int len = sc.nextInt();
		
		
		for(int i=0; i<len; i++) {
			
			System.out.println("Enter the roll no of student");
			
			int rollNumber = sc.nextInt();
			
			System.out.println("Enter the name of the student");
			
			String nameStudent = sc.next();
			
			
			System.out.println("Enter the Marks of student");
			
			int marksStudent = sc.nextInt();
			
			studentAdd.add(new Students(rollNumber, nameStudent, marksStudent));
			
		}
		
		
//		List<Students> sortlist = studentAdd.stream()
//				.sorted(Comparator.comparingInt(Students::getRollno)).
//				collect(Collectors.toList());
		
		List<Students> sortMarks = studentAdd.stream().sorted(Comparator.comparingInt(Students::getRollno))
				.filter(s -> s.getMarks()<250)
				.collect(Collectors.toList());
		
		
		System.out.println(sortMarks);
		
		
		
	}

}
