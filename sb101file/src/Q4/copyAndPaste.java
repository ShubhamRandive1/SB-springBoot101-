package Q4;

import java.util.*;
import java.util.concurrent.ExecutionException;
import java.io.*;

public class copyAndPaste {
	
	public static void Data(File f1, File f2) throws Exception{
		
		
		FileInputStream inputstream = new FileInputStream(f1);
		
		FileOutputStream outputstream = new FileOutputStream(f2);
		
		
		try {
			
			int i;
			
			while((i = inputstream.read()) != -1) {
				
				outputstream.write(i);
			}
			
			
		}catch(Exception ex) {
			
			ex.printStackTrace();
		}finally {
			
			if(inputstream != null) {
				
				inputstream.close();
			}if(outputstream != null) {
				
				outputstream.close();
			}
		}
		
		System.out.println("Copied the data");
	}
	
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the file name from which you want to copy the data");
		
		String f1 = sc.nextLine();
		
		File x = new File("D:\\"+f1);
		
		System.out.println("Enter the output file name");
		
		String f2 = sc.nextLine();
		
		File y = new File("D:\\"+f2);
		
		sc.close();
		
		
		Data(x, y);
	}

}
