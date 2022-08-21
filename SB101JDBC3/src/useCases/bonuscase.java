package useCases;

import java.util.Scanner;

import DaoPattern.empDao;
import DaoPattern.empDaoimpl;
import Employee.employee3;
import exception.empException;

public class bonuscase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the employee id");
		
		int eid = sc.nextInt();
		
		System.out.println("enter the bonus");
		
		int bonus = sc.nextInt();
		
		employee3 emp = new employee3();
		
		empDao dao = new empDaoimpl();
		
		employee3 res;
		try {
			res = dao.bonusToEmp(eid, bonus);
			
			System.out.println(res);
		} catch (empException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
