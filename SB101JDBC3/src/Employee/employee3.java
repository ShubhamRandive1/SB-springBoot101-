package Employee;

public class employee3 {
	
	private int eid;
	
	private String name;
	
	private String address;
	
	private int salary;

	public employee3() {
		
	}

	public employee3(int eid, String name, String address, int salary) {
		
		this.eid = eid;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "employee3 [eid=" + eid + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	
	

}
