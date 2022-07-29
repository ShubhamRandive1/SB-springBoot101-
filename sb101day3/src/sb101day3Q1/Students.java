package sb101day3Q1;

public class Students {
	
	private int RollNo;
	
	private String Name;
	
	private int marks;

	public Students() {
		
	}

	public Students(int rollNo, String name, int marks) {
		
		RollNo = rollNo;
		Name = name;
		this.marks = marks;
	}

	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Students [RollNo=" + RollNo + ", Name=" + Name + ", marks=" + marks + "]";
	}
	
	
	
	
	

}
