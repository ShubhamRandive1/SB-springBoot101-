package sb101Q1;

import java.util.*;


public class Main {
	
	public static void main(String[] args)throws Exception {
		
		
		Scanner sc = new Scanner(System.in);
		
		//Dynamically input taking
		
		System.out.println("enter the number of employee you want to add");
		
		int numberOfEmployee = sc.nextInt();
		
		TreeMap<Employee, Integer> employe = new TreeMap<>();
		
		for(int i = 0;i<numberOfEmployee;i++) {
			
			System.out.println("Enter the employee name");
			
			String nameEmployee = sc.next();
			
			System.out.println("Enter the employee id");
			
			int idEmployee = sc.nextInt();
			
			System.out.println("Enter the address of employee");
			
			String employeeAddress = sc.next();
			
			System.out.println("Enter the employee salary");
			
			int salary = sc.nextInt();
			
			
			Employee nameEmployee2 = new Employee(idEmployee,nameEmployee,employeeAddress);
			
			employe.put(nameEmployee2, salary);
			
			
			System.out.println("press "+ " n "+ " to end the input " +" or y to continue input");
			
			String addMore = sc.next();
			
			if(addMore ==  "n") {
				
				break;
			}
			
				
		}
		
		for(Map.Entry<Employee, Integer> customer : employe.entrySet()) {
			
			System.out.println(customer.getKey().getName()+" "+customer.getKey().getEmpId()+" "+customer.getKey().getAddress()+" "+customer.getValue());
		}

		
		//Static input method below
		
//		Employee employee1 = new Employee(19,"raju","abc dummy address");
//		
//		Employee employee2 = new Employee(29,"shayam","abcd");
//		
//		Employee employee3 = new Employee(14,"baburao","abcde");
//		
//		Employee employee4 = new Employee(17,"anuradha","abcdef");
//		
//		Employee employee5 = new Employee(18,"anjali","abcdefg");
//		
//		employe.put(employee1, 55000);
//		
//		employe.put(employee2, 60000);
//		
//		employe.put(employee3, 70000);
//		
//		employe.put(employee4, 80000);
//		
//		employe.put(employee5, 90000);
//		
//		
//		for(Map.Entry<Employee, Integer> customer : employe.entrySet()) {
//			
//			System.out.println(customer.getKey().getName()+" "+customer.getKey().getEmpId()+" "+customer.getKey().getAddress()+" "+customer.getValue());
//		}
		
	}

}
