package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class insertData {
	
	static String url = "jdbc:mysql://localhost:3306/db2";
	
	static String user = "root";
	
	static String password = "Shubhamcool1";


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employee id");
		
		int empid = sc.nextInt();
		
		System.out.println("enter the name");
		
		String name = sc.next();
		
		System.out.println("enter the address");
		
		String address = sc.next();
		
		System.out.println("enter the salary");
		
		int esalary = sc.nextInt();
		 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		String str = "insert into employee2 values(?,?,?,?)";
		
		try(Connection connn = DriverManager.getConnection(url,user,password)) {
			
			Statement stm = connn.createStatement();
		
			
			
			PreparedStatement ps2 = connn.prepareStatement(str);
			
			
			
			ps2.setInt(1, empid);
			
			ps2.setString(2, name);
			
			ps2.setString(3, address);
			
			ps2.setInt(4, esalary);
			
			
			int i =ps2.executeUpdate();
			
			if(i != 0) {
				System.out.println("added");
			}else {
				System.out.println("failde to add");
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		TABLE 
		
//		mysql> select * from employee2;
//		+-----+----------+----------+--------+
//		| eid | name     | address  | salary |
//		+-----+----------+----------+--------+
//		|   1 | ram      | delhi    |  80000 |
//		|   2 | shayam   | mumbai   | 100000 |
//		|   3 | baburao  | pune     |  60000 |
//		|   4 | raju     | kolhapur |  70000 |
//		|   5 | anuradha | dubai    | 200000 |
//		|   6 | roy      | delhi    |  60000 |
//		+-----+----------+----------+--------+
//		6 rows in set (0.00 sec)

	}

}
