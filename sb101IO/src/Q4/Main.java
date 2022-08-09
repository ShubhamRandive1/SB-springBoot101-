package Q4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		System.out.println("serilization start -----------------------");
		
		Address address=new Address("Nashik","Maharashtra","422005");
		
		Employee emp = new Employee(17, "shubham",address.toString(), "abc@gmail.com", "1234");
		
		ObjectOutputStream objectstream = new ObjectOutputStream(new FileOutputStream("emp.txt"));
		
		objectstream.writeObject(emp);
		
		objectstream.close();
		
		System.out.println("Writing Done");
		
		//System.out.println(ad.toString());
		
		//System.out.println(students);
		
		
		System.out.println("deserilization-----------------");
		
		
		ObjectInputStream objin = new ObjectInputStream(new FileInputStream("emp.txt"));
		
		Employee stu = (Employee) objin.readObject();
		
		System.out.println(stu);
		
		objin.close();

	}

}
