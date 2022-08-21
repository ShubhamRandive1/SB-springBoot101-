package DaoPattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;
import com.mysql.cj.xdevapi.Result;

import Employee.employee3;
import dataBase.dataBAse;
import exception.empException;

public class empDaoimpl implements empDao{

	@Override
	public String insertEmpData(employee3 emp3) {
		// TODO Auto-generated method stub
		String res = "Not inserted....";
		
		try(Connection conn = dataBAse.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("INSERT INTO employee3 values(?,?,?,?)");
			
			
			ps.setInt(1, emp3.getEid());
			
			ps.setString(2, emp3.getName());
			
			ps.setString(3, emp3.getAddress());
			
			ps.setInt(4, emp3.getSalary());
			
			int i = ps.executeUpdate();
			
			if(i > 0) {
				
				res = "Inserted Successfully";
			}
			
			
		}catch(SQLException e) {
			
			res = e.getMessage();
			
		}
		
		return res;
	}

	@Override
	public employee3 getempSalaryById(int eid) throws empException {
		// TODO Auto-generated method stub
		
		employee3 emp = null;
		
		try(Connection conn = dataBAse.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM employee3 WHERE id=?");
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				int id = rs.getInt("eid");
				
				String n = rs.getString("name");
				
				String a = rs.getString("address");
				
				int s = rs.getInt("salary");
				
				
				emp = new employee3(id, n, a, s);
				
				
			}else {
				
				throw new empException("not employee with id"+eid);
			}
			
			
		}catch(SQLException e) {
			
			throw new empException(e.getMessage());
		}
		
		return emp;
		
	}

	@Override
	public employee3 getempsalaryLessThan(int salary) throws empException {
		// TODO Auto-generated method stub
			employee3 emp = null;
			
			try(Connection conn = dataBAse.provideConnection()){
				
				PreparedStatement ps = conn.prepareStatement("SELECT * FROM employee3 WHERE salary < 80000");
				
				ResultSet rs = ps.executeQuery();
				
				if(rs.next()) {
					
					int id = rs.getInt("eid");
					
					String n = rs.getString("name");
					
					String a = rs.getString("address");
					
					int s = rs.getInt("salary");
					
					
					emp = new employee3(id, n, a, s);
				}else {
					
					throw new empException("no employee salary less than 80000");
				}
				
				
			}catch(SQLException e) {
				
				throw new empException(e.getMessage());
			}
			
			return emp;
	}

	@Override
	public employee3 bonusToEmp(int eid ,int bonus) throws empException {
		// TODO Auto-generated method stub
		employee3 emp = null;
		
		try(Connection conn = dataBAse.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("UPDATE employee3 SET salary = salary+? where eid=?");
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				int id = rs.getInt("eid");
				
				String n = rs.getString("name");
				
				String a = rs.getString("address");
				
				int s = rs.getInt("salary");
				
				
				emp = new employee3(id, n, a, s);
				
				
			}else {
				
				throw new empException("no employee with the id"+eid);
			}
			
		}catch(SQLException e) {
			
			throw new empException(e.getMessage());
		}
		
		return emp;
	}

	@Override
	public List<employee3> getEmployeedetails() throws empException {
		// TODO Auto-generated method stub
		
		List<employee3> emp = new ArrayList<>();
		
		
		try(Connection conn = dataBAse.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM employee3");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				
				int id = rs.getInt("eid");
				
				String n = rs.getString("name");
				
				String a = rs.getString("address");
				
				int s = rs.getInt("salary");
				
				
				employee3 emps = new employee3(id, n, a, s);
				
				emp.add(emps);
			}
			
			if(emp.size() == 0) {
				
				throw new empException("no employee found");
			}
			
			
		}catch(SQLException e) {
			
			throw new empException(e.getMessage());
		}
		
		return emp;
	}
	
	

}
