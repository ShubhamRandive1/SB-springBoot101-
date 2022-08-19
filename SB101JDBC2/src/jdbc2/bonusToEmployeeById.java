package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class bonusToEmployeeById {
	
	static String url = "jdbc:mysql://localhost:3306/db2";
	
	static String user = "root";
	
	static String password = "Shubhamcool1";

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the bonus you want to give to employee id");
		
		int id = sc.nextInt(); 
		
		System.out.println("enter the bonus amount");
		
		int bonus = sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(Connection conn = DriverManager.getConnection(url,user,password)){
			
			PreparedStatement stm = conn.prepareStatement("UPDATE Employee2 SET salary = salary+? Where eid="+id);
			
			stm.setInt(1, bonus);
			
			
			int i=stm.executeUpdate();
			
			if(i > 0) {
				System.out.println(i+"Employees Salary "+"bonus added successfully");
				
				
			}else {
				System.out.println("enter the proper employee id");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		

	}

}
