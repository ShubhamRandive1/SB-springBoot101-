package TableCreate;

import java.sql.Connection;
import java.sql.Statement;

import jDaoConnection.DAOConn;

public class TableCreation {
	
	static String link = "jdbc:mysql://localhost:3306/ABCDatabase";
	
	
	static String user = "root";
	
	
	static String password = "Shubhamcool1";
	
	
	
	public static void main(String[] args) {
		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		}catch(ClassNotFoundException e) {
			
			
			e.printStackTrace();
			
		}
		
		
		try(Connection conn = DAOConn.provideConnection()){
			
			Statement stm = conn.createStatement();
			
			String sql ="Create Table ABCDatabase"+"(id int not null primary key,"+"roll int not null,"+"name varchar(20),"+"standars varchar(2),"+"fees int)";
			
			
			stm.executeUpdate(sql);
			
			System.out.println("Table is created");
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	

}
