package sb101IOQ1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("serilization start -----------------------");
		
		Address ad=new Address("Nashik","Maharashtra","422005");
		
		Student students = new Student(17, "shubh", ad.toString(), "abc@gmail.com", "1234");
		
		ObjectOutputStream objectstream = new ObjectOutputStream(new FileOutputStream("student.txt"));
		
		objectstream.writeObject(students);
		
		objectstream.close();
		
		System.out.println("Writing Done");
		
		//System.out.println(ad.toString());
		
		//System.out.println(students);
		
		
		System.out.println("deserilization-----------------");
		
		
		ObjectInputStream objin = new ObjectInputStream(new FileInputStream("student.txt"));
		
		Student stu = (Student) objin.readObject();
		
		System.out.println(stu);
		
		objin.close();
	}

}
