package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
	
	static String url = "jdbc:mysql://localhost:3306/db2";
	
	static String user = "root";
	
	static String password = "Shubhamcool1";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter employee id");
//		
//		int empid = sc.nextInt();
//		
//		System.out.println("enter the name");
//		
//		String name = sc.next();
//		
//		System.out.println("enter the address");
//		
//		String address = sc.next();
//		
//		System.out.println("enter the salary");
//		
//		int esalary = sc.nextInt();
		 
		
		//PreparedStatement ps = null;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		try(Connection conn = DriverManager.getConnection(url,user,password);
				Statement stm = conn.createStatement();
				){
			
			String sql = "CREATE TABLE Employee2" +
		"(eid int primary key,"+
			"name varchar(15),"+
			"address varchar(15),"+
			"salary int)";
			
			
			stm.executeUpdate(sql);
			
			System.out.println("Table created successfully");
						
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		String str = "insert into employee2 values(?,?,?,?)";
//		
//		try(Connection connn = DriverManager.getConnection(url,user,password)) {
//			
//			Statement stm = connn.createStatement();
//			
//			
//			PreparedStatement ps2 = connn.prepareStatement(str);
//			
//			
//			
//			ps2.setInt(1, empid);
//			
//			ps2.setString(2, name);
//			
//			ps2.setString(3, address);
//			
//			ps2.setInt(4, esalary);
//			
//			
//			int i =ps2.executeUpdate();
//			
//			if(i != 0) {
//				System.out.println("added");
//			}else {
//				System.out.println("failde to add");
//			}
//			
//			
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
