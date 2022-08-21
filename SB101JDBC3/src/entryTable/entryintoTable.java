package entryTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class entryintoTable {
	
	static String url = "jdbc:mysql://localhost:3306/db3";
	
	static String user = "root";
	
	static String password = "Shubhamcool1";


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try(Connection conn = DriverManager.getConnection(url,user,password);
				Statement stm = conn.createStatement();
				
				){
				
			     String	sql ="CREATE TABLE Employee3"+
						"(eid int primary key,"+
						"name varchar(15),"+
						"address varchar(15),"+
						"salary int)";
				
			stm.executeUpdate(sql);
			
			System.out.println("Table created successfully");
			
			
		}catch(SQLException e) {
			
			e.printStackTrace();
		}

	}

}
