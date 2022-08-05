package sb101fileQ1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Demo {
	
	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("D:\\abc.txt");
		
		int i;
		
		while((i=fr.read())!= -1) {
			
			System.out.println((char)i);
			
		}
		
		fr.close();
		
	}

}

