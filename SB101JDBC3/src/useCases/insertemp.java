package useCases;

import java.util.Scanner;

import DaoPattern.empDao;
import DaoPattern.empDaoimpl;
import Employee.employee3;

public class insertemp {
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the employee id");
		
		int eid = sc.nextInt();
		
		System.out.println("Enter the name");
		
		String name = sc.next();
		
		System.out.println("Enter the address");
		
		String address = sc.next();
		
		System.out.println("enter the salary");
		
		int salary = sc.nextInt();
		
		
		employee3 emp = new employee3(eid, name, address, salary);
		
		
		empDao dao = new empDaoimpl();
		
		String res = dao.insertEmpData(emp);
		
		System.out.println(res);
		
	}

}
