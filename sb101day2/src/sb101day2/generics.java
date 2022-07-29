package sb101day2;

import java.util.*;

public class generics {
	
	public static void main(String[] args) {
		//not type safe
		
		List list = new ArrayList();
		
		list.add(5);
		list.add("five");
		
		//int num = (int)list.get(1);//run time code break class cast exceptions
		
		//Generic give possibility to check at compile time for errors
		
		System.out.println(list);
		
		List<Integer> integerList = new ArrayList<>();
		
		integerList.add(5);
		
		//integerList.add("5");//fail fast type Safety or compile time error jack
		
		integerList.add(10);
		
		int num = integerList.get(1);
		
		System.out.println(num);
		
	}

}

class MyArrayList{
	
	public boolean add(Object object) {
		return true;
	}
	
	public Object get(int index) {
		
		return 0;
	}
}

//write generic class own
//can use any char used here T type Object

class MyArrayListWithGeneric<T>{
	
	public boolean add(T object) {
		
		return true;
	}
	
	public T get(int index) {
		T t = null;
		return t;
	}
	
	
}
