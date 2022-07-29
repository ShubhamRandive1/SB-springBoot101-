package sb101day3Q1;

import java.nio.file.DirectoryStream.Filter;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of studenrt you want to add");
		
		int len = sc.nextInt();
		
		List<Students> student = new ArrayList<>();
		
		for (int i = 0; i < len; i++) {
			
		
		
		System.out.println("Enter the roll number of the student");
		
		int Rollnumber = sc.nextInt();
		
		System.out.println("Enter the name of the student");
		
		String Studentname = sc.next();
		
		System.out.println("Enter the marks obtained by student out of 500");
		
		int studentMarks = sc.nextInt();
		
		
		student.add(new Students(Rollnumber,Studentname,studentMarks));
					
		}
		
		List<Students> list = student.stream().filter(students -> students.getMarks()<250).collect(Collectors.toList());
		
		for(Students students:list) {
			System.out.println(students.getName());
		}
		
		
		

	}

}
