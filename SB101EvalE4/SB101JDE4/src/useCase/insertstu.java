package useCase;

import java.util.Scanner;

import DAO.StudentimplDao;
import DAO.studentDao;
import Student.student;

public class insertstu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter id");
		
		int id = sc.nextInt();
		
		System.out.println("enter the roll");
		
		int roll = sc.nextInt();
		
		System.out.println("enter the name");
		
		String name = sc.next();
		
		System.out.println("enter the standard");
		
		String standard = sc.next();
		
		System.out.println("enter the fees");
		
		int fees = sc.nextInt();
		
		student stu = new student(id, roll, name, standard, roll, fees);
		
		
		studentDao dao = new StudentimplDao();
		
		String res = dao.insertStudentData(stu);
		
		System.out.println(res);

	}

}
