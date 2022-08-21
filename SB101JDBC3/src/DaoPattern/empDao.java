package DaoPattern;

import java.util.List;

import Employee.employee3;
import exception.empException;

public interface empDao {
	
	public String insertEmpData(employee3 emp3);
	
	public employee3 getempSalaryById(int eid)throws empException;
	
	public employee3 getempsalaryLessThan(int salary)throws empException;
	
	public employee3 bonusToEmp(int eid, int bonus)throws empException;
	
	public List<employee3> getEmployeedetails() throws empException;
	
	

}
