package userCases;

import java.util.Scanner;

import DAO.StudentimplDao;
import DAO.accounDAO;
import DAO.studentDao;
import Student.student;
import accountbean.ACCOUNT;

public class save {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter id");
		
		int id = sc.nextInt();
		
		System.out.println("enter the roll");
		
		int roll = sc.nextInt();
		
		System.out.println("enter the name");
		
		String email = sc.next();
		
		System.out.println("enter the standard");
		
		String address = sc.next();
		
		System.out.println("enter the fees");
		
		double balance = sc.nextInt();
		
		ACCOUNT acc = new ACCOUNT(id, email, address, balance);
		
		
		accounDAO dao = new accounDAO();
		
		int res = dao.findById(acc);
		
		System.out.println(res);

	}

}
