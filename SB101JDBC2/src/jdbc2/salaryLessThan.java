package jdbc2;

import java.awt.Taskbar.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class salaryLessThan {
	
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
			
			ResultSet rs = stm.executeQuery("SELECT * FROM Employee2 WHERE salary < 80000");
			
			while(rs.next()) {
				
				System.out.println(rs.getInt("eid"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("address"));
				System.out.println(rs.getInt("salary"));
			}
			
			
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
