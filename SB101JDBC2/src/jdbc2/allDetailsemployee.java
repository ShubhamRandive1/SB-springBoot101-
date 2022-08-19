package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class allDetailsemployee {
	
	static String url = "jdbc:mysql://localhost:3306/db2";
	
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
		
		
		try(Connection conn = DriverManager.getConnection(url,user,password)){
			
			Statement stm = conn.createStatement();
			
			ResultSet rs = stm.executeQuery("SELECT * FROM Employee2");
			
			while(rs.next()) {
				
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
			}
			
		
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
