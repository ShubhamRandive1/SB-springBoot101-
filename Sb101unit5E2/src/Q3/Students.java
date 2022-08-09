package Q3;

public class Students {
	
	private int Rollno;
	
	private String Name;
	
	private int Marks;
	
	

	public Students() {
		
	}



	public Students(int rollno, String name, int marks) {
		
		Rollno = rollno;
		Name = name;
		Marks = marks;
	}



	public int getRollno() {
		return Rollno;
	}



	public void setRollno(int rollno) {
		Rollno = rollno;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public int getMarks() {
		return Marks;
	}



	public void setMarks(int marks) {
		Marks = marks;
	}



	@Override
	public String toString() {
		return "Students [Rollno=" + Rollno + ", Marks=" + Marks + ", Name=" + Name + "]";
	}
	
	
	
	

}
