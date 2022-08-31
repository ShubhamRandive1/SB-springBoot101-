package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Student.student;
import exception.studentException;
import jDaoConnection.DAOConn;

public class StudentimplDao implements studentDao{

	@Override
	public String insertStudentData(student stu) {
		// TODO Auto-generated method stub
		String res = "Not Inserted";
		
		try(Connection conn = DAOConn.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("INSERT INTO ABCDatabase values(?,?,?,?,?,?");
			
			ps.setInt(1, stu.getId());
			
			ps.setInt(2, stu.getRoll());
			
			ps.setString(3, stu.getName());
			
			ps.setString(4, stu.getStandard());
			
			ps.setInt(5, stu.getDate_Of_Birth());
			
			ps.setInt(6, stu.getFees());
			
			int i = ps.executeUpdate();
			
			if( i > 0) {
				
				res = "Inserted Student Data";
				
				
			}
			
			
		}catch(SQLException e) {
			
			res = e.getMessage();
			
		}
		
		return res;
	}

	@Override
	public student getStudentById(int id) throws studentException {
		// TODO Auto-generated method stub
		student stu = null;
		
		try(Connection conn = DAOConn.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM ABCDatabse where id=?");
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				int Stuid = rs.getInt("id");
				
				int rollno = rs.getInt("roll");
				
				String name = rs.getString("name");
				
				String standard = rs.getString("standard");
				
				int DOB = rs.getInt("Date_Of_Birth");
				
				int fee = rs.getInt("Fees");	
				
				stu = new student(Stuid, rollno, name, standard, DOB, fee);
				
			}else {
				
				throw new studentException("no student available");
			}
			
			
		}catch(SQLException e) {
			
			throw new studentException(e.getMessage());
		}
		
		
		return stu;
	}

	@Override
	public student getStudentbynameAndId(String name, int id) throws studentException {
		// TODO Auto-generated method stub
		
		student stu = null;
		
		try(Connection conn = DAOConn.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM ABCDatabase Where name=? and id=?");
			
			ResultSet rs = ps.executeQuery();
			
			
			if(rs.next()) {
				
				int Stuid = rs.getInt("id");
				
				int rollno = rs.getInt("roll");
				
				String Sname = rs.getString("name");
				
				String standard = rs.getString("standard");
				
				int DOB = rs.getInt("Date_Of_Birth");
				
				int fee = rs.getInt("Fees");	
				
				stu = new student(Stuid, rollno, Sname, standard, DOB, fee);
				
				
			}else {
				
				throw new studentException("Student Not found");
			}
			
		}catch(SQLException e) {
			
			
		}
		
		return stu;
	}

	@Override
	public student updatenameById(int id) throws studentException {
		// TODO Auto-generated method stub
		student stu = null;
		
		try(Connection conn = DAOConn.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("UPDATE FROM ABCDatabase SET name = ? where id=?");
			
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				int Stuid = rs.getInt("id");
				
				int rollno = rs.getInt("roll");
				
				String Sname = rs.getString("name");
				
				String standard = rs.getString("standard");
				
				int DOB = rs.getInt("Date_Of_Birth");
				
				int fee = rs.getInt("Fees");	
				
				stu = new student(Stuid, rollno, Sname, standard, DOB, fee);
				
				
			}else {
				
				throw new studentException("Student Not found by id");
			}

			
			
			
			
		}catch(SQLException e) {
			
			throw new studentException(e.getMessage());
		}
		
		
		
		return stu;
	}

	@Override
	public student deleteStudentbyId(int id) throws studentException {
		// TODO Auto-generated method stub
		
		student stu = null;
		
		try(Connection conn = DAOConn.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("DELETE FROM ABCDatabase where id=?");
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				int Stuid = rs.getInt("id");
				
				int rollno = rs.getInt("roll");
				
				String Sname = rs.getString("name");
				
				String standard = rs.getString("standard");
				
				int DOB = rs.getInt("Date_Of_Birth");
				
				int fee = rs.getInt("Fees");	
				
				stu = new student(Stuid, rollno, Sname, standard, DOB, fee);
				
				
			}else {
				
				throw new studentException("Not Deleted");
			}
			
			
			
		}catch(SQLException e) {
			
			
		}
		
		
		return stu;
	}
	
	
	

}
