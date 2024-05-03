
//Generics

// without generics class
/**
class Box {
	
	int height;
	Box(int height ){
		this.height = height;
	}
	
}**/

// object of normal class

//Box box = new Box(10);


// In Generics - with Class, we can associate a parameter type just like methods have parameters 

// class with generics
class Box<T> {
	T t;
	Box(T t){
		this.t = t;
	}
	
	String getValue(){
		return this.t.toString();
	}
}

// compiler convert above code to
/**
class Box<String>{
	private String t;
	Box(String t){
		this.t = t;
	}
	String getValue(){
		return this.t.toString();
	}
	
}
**/


// T - paramter type
// Ex - List<Integer> - here integer will map to T
// to avoid error at run time, we can use generics to have strong data type which will give error at compile time
// T - non primitve data type - class, interface, array, ..

public class Generics{
	public static void main(String args[]) {
		
		Box<String> integerBox = new Box<String>("Hello");
		System.out.println(integerBox.getValue());
		
	}
}










