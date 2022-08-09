package Q2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		
		employee emp = new employee("Shubham", "12/08/97", "Product Manger", "Manager");
		
		ObjectOutputStream empObj = new ObjectOutputStream(new FileOutputStream("OutObject.txt"));
		
		empObj.writeObject(empObj);
		
		empObj.close();
		
		System.out.println("storing object data done");
		
		ObjectInputStream objin = new ObjectInputStream(new FileInputStream("OutObject.txt"));
		
		employee empp = (employee) objin.readObject();
		
		System.out.println(empp);
		
		objin.close();

	}

}
