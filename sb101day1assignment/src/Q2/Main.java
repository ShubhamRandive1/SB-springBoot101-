package Q2;

import java.util.*;


import Q2.Student;


public class Main {
	
	public static void main(String[] args) {
		
		
		Map<Q2.Student,String> stateAndStudent = new TreeMap<>(new StudentComparemarks<>());
		
		
		
		Student s1 = new Student(10, "Raju", 850);
		
		Student s2 = new Student(15, "shayam", 950);

		Student s3 = new Student(20, "BabuRao", 900);

		Student s4 = new Student(25, "Anuradha", 1050);

		Student s5 = new Student(35, "Anjali", 1000);

		
		stateAndStudent.put(s1, "Maharashtra");
		stateAndStudent.put(s2, "Chennai");
		stateAndStudent.put(s3, "Bangalore");
		stateAndStudent.put(s4, "Kolkata");
		stateAndStudent.put(s5, "Uttar Pradesh");
		
		
		//System.out.println(s1);
		
		System.out.println(stateAndStudent);
		
		
		
		
	}

}
	