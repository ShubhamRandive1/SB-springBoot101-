package TableCreation;

import java.beans.Statement;
import java.sql.Connection;

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
			
			
			try(Connection conn = DAOCONNECT.DAOConn.provideConnection()){
				
				Statement stm = (Statement) conn.createStatement();
				
				String sql ="Create Table account"+"(id int not null primary key,"+"email varchar(20),"+"address varchar(2),"+"balance double)";
				
				
				((java.sql.Statement) stm).executeUpdate(sql);
				
				System.out.println("Table is created");
				
			}catch(Exception e) {
				
				e.printStackTrace();
			}
			
		}
		
		

	}
