package Q2;

import java.io.Serializable;

public class employee implements Serializable{
	
	private String name;
	
	private String dob;
	
	private String department;
	
	private String designation;

	public employee() {
		
	}

	public employee(String name, String dob, String department, String designation) {
		
		this.name = name;
		this.dob = dob;
		this.department = department;
		this.designation = designation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "employee [name=" + name + ", dob=" + dob + ", department=" + department + ", designation=" + designation
				+ "]";
	}
	
	
	

}
