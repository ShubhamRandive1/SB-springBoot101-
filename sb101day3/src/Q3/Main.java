package Q3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> students = new ArrayList<>();
		
		System.out.println("enter the number of student");
		
		Scanner sc = new Scanner(System.in);
		
		int len = sc.nextInt();
		
		for (int i = 0; i < len; i++) {
			
			System.out.println("eneter the roll number of student");
			
			int rollStudent = sc.nextInt();
			
			System.out.println("enter the name of student");
			
			String nameStudent = sc.next();
			
			System.out.println("enter the marks of the student");
			
			int studentMarks = sc.nextInt();
			
			students.add(new Student(rollStudent,nameStudent,studentMarks));
			
		}
		
		List<Employee> employeeList = students.stream().map(s -> {
			
			Employee employees = new Employee();
			
			employees.setEmpId(s.getRoll());
			
			employees.setEmpName(s.getName());
			
			employees.setSalary(s.getMarks()*1000);
			
			return employees;
			
		}).collect(Collectors.toList());
		
		
		for (Employee employee : employeeList) {
			
			System.out.println("employee id :"+" "+employee.getEmpId() );
			System.out.println("employee name :"+" "+employee.getEmpName());
			System.out.println("employee salary :"+" "+employee.getSalary());
		}

	}

}
