package useCases;

import java.util.Scanner;

import DaoPattern.empDao;
import DaoPattern.empDaoimpl;
import Employee.employee3;
import exception.empException;

public class empById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the employee id");
		
		int id = sc.nextInt();
		
		System.out.println("enter the salary");
		
		int salary = sc.nextInt();
		
		
		employee3 emp = new employee3(id, null, null, salary);
		
		empDao dao = new empDaoimpl();
		
		try {
			employee3 res = dao.getempSalaryById(id);
			
			System.out.println(res);
		} catch (empException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
