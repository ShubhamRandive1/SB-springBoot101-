package sb101day2;

public class YourOwnGenerics {
	
	public static void main(String[] args) {
		
		MyGenerics<String> stringMyGenerics = new MyGenerics<>();
		
		
		stringMyGenerics.add("one");
		stringMyGenerics.add("two");
		
		System.out.println(stringMyGenerics.get());
		
		//Number is super type for integer,float,double etc
		
		MyGenerics<Number> myGenericsNumbers = new MyGenerics<>();
		
		myGenericsNumbers.add(10);
		
		System.out.println(myGenericsNumbers.get());
	}

}

//K ,V ,T ,E ,N
//K=keys of map
//V= values
//E=elements ArrayList
//T= object type
//N=Number instead of integer or float or double when we are unaware of type
class MyGenerics<T>{
	
	T obj;
	
	void add(T object) {
		this.obj = object;
	}
	
	T get(){
		return obj;
	}
	
}
