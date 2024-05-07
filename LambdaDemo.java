

// normal methods - 
/**
int sum(int num1, int num2){
	return num1 + num2;
}

pass -> data

pass logic/algo/method body -> lambda expressions**/

// interfaces 
// fnctional interface
interface LamdaDem{
	// abstract method
	void print();
	
	//int sum();
	
	// after java 8, we can give body of methods in interface using default keyword
	default void printHelloWorld(){
		System.out.println("Hello World");
	}
}
/**
class LambdaDemoImpl implements LamdaDem{
	
	public void print(){
		System.out.println("Hello");
	}	
}

class LambdaDemoImpl2 implements LamdaDem{
	
	public void print(){
		System.out.println("Hello There");
	}	
}
**/


public class LambdaDemo{
	public static void main(String args[]){
		//LambdaDemoImpl ldI = new LambdaDemoImpl();
		//ldI.print();
		
		LamdaDem obj = () -> {	System.out.println("Hello");
												System.out.println("Next Line");
											};											// lambda expression -> method definition/ code / logic 
											
		obj.print(); // same code will be used when we call print 
	}
}


//. lambda expression gives the body of abstract method in interface
// necessary condition -> interface should be functional interface - only 1 abstract method
// Syntax of lambda expression

(<parameter of method>) -> {
	// code logic in multiple lines
	
	
}




