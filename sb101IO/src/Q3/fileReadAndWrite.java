package Q3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class fileReadAndWrite {

		public static void main(String[] args) throws IOException {
		
			String text =("Welcome");

			
			Path fileName = Path.of("file.txt");

			Files.writeString(fileName, text);
				
			String file_content = Files.readString(fileName);
		
			
			System.out.println(file_content);
			
			
			// Rewrite to upper case to Newfile.txt
			
			FileReader reader = new FileReader("file.txt");
			
		    String result = "";
		    
		    int data;
		    
		    int data2;
		    
		    while ((data = reader.read()) != -1) {
		    	
		        data2 = Character.toUpperCase(data);
		        
		        result += (char)data2;
		    }
		    reader.close();
		    
		    System.out.println(result);
		    
		    FileWriter writer = new FileWriter("Newfile.txt");
		    
		    writer.write(result);
		    
		    writer.flush();
		    
		    writer.close();
			
		}
	


}
