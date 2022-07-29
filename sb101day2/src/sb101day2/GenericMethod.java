package sb101day2;

import java.util.*;

public class GenericMethod {
	
	//print an array by writing a method
	//Method - print an array
	
	public static void main(String[] args) {
		
		Integer[] intArray = {1,2,3,4,5};
		
		Character[] charArray = {'a','b','c','d','e'};
		
		printArrayGeneric(intArray);
		
		printArrayGeneric(charArray);
		
		Map<String,String> map;
		
	}
	
	public static void printArray(int[] integerArray) {
		
		
	}
	//similarly we have to make multiple times for different data types like string 
	//this is called DRY - don't repeat yourself
	
	public static <E> void printArrayGeneric(E[] elements) {
		
		for(E element : elements) {
		
			System.out.println(element);
	}
		
		

	}
}
