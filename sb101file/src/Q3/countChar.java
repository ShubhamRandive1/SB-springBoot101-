package Q3;

import java.util.*;

import java.io.*;

public class countChar {
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the character");
		
		char character = sc.next().charAt(0);
		
		
		File files = new File("D://abc.txt");
		
		FileReader fileread = new FileReader(files);
		
		int count = 0;
		
		int i = fileread.read();
		
		while(i!=-1) {
			
			if((char)i == character) {
				
				count++;
				
			}
			 
			i=fileread.read();
			
		}
		
		System.out.println("File "+files+" "+" has  "+count+" the instances letter  "+character+" ");

	}

}
