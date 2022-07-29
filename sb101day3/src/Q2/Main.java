package Q2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<Student> students = new ArrayList<>();
		 
		 System.out.println("enter the number of student");
		 
		 Scanner sc = new Scanner(System.in);
		 
		 int len = sc.nextInt();
		 
		 for (int i = 0; i < len; i++) {
			 
			 System.out.println("enter roll number of student");
			 
			 int rollStudent = sc.nextInt();
			 
			 System.out.println("enter the name of student");
			 
			 String studentName = sc.next();
			 
			 System.out.println("enter the marks of student");
			 
			 int marksStudent = sc.nextInt();
			 
			 students.add(new Student(rollStudent,studentName,marksStudent));
			
		}
		 
		 List<Student> studentFiltermarks = students.stream().filter(s -> s.getMarks()<800).collect(Collectors.toList());
		 
		 System.out.println(studentFiltermarks);

	}

}
