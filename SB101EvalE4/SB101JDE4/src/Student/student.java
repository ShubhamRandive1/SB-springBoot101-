package Student;

public class student {
	
	private int id;

	private int roll;
	
	private String name;
	
	private String standard;
	
	private int Date_Of_Birth;
	
	private int fees;

	
	public student(int id, int roll, String name, String standard, int date_Of_Birth, int fees) {
		
		this.id = id;
		this.roll = roll;
		this.name = name;
		this.standard = standard;
		Date_Of_Birth = date_Of_Birth;
		this.fees = fees;
	}


	public student() {

	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public String getStandard() {
		return standard;
	}


	public void setStandard(String standard) {
		this.standard = standard;
	}


	public int getDate_Of_Birth() {
		return Date_Of_Birth;
	}


	public void setDate_Of_Birth(int date_Of_Birth) {
		Date_Of_Birth = date_Of_Birth;
	}


	public int getFees() {
		return fees;
	}


	public void setFees(int fees) {
		this.fees = fees;
	}


	@Override
	public String toString() {
		return "student [id=" + id + ", roll=" + roll + ", name=" + name + ", standard=" + standard + ", Date_Of_Birth="
				+ Date_Of_Birth + ", fees=" + fees + "]";
	}
	
	
	
	

}
