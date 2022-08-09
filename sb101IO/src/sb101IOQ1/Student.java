package sb101IOQ1;

import java.io.Serializable;

public class Student implements Serializable{
	
	private int roll;
	
	private String name;
	
	private String address;
	
	private String email;
	
	transient private String password;

	public Student() {
		
	}

	public Student(int roll, String name, String address, String email, String password) {
	
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.email = email;
		this.password = password;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + ", email=" + email + ", password="
				+ password + "]";
	}
	
	

}