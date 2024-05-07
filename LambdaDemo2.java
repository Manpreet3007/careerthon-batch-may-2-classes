// lambda expressions
// body of abstract method present in the functional interface
// syntax (<parameters>) -> {//code of method}

// how to pass a code in method

// functional interface
/**
interface PrintSomething<T>{
	
	void printSomething(T obj);
	
}

**/
// similar method is present in Consumer interface - when we want to print / or nay operation that does not return anything
import java.util.function.*;

public class LambdaDemo2{
	public static void main(String args[]) {
		
		Consumer<String> p =  (String s) ->  System.out.println(s);
		p.accept("Hello");
		// above code is something like
//void printSomething(String s) {
	//System.out.println(s);
//}
		
		PrintSomething<Integer> intPrint = (Integer i) -> System.out.println(i.longValue() + 20);
		intPrint.printSomething(new Integer(10));
		
		// when calling m1 method, we will pass the body of printSomething abstract method of interface PrintSomethin	
	}
}



// pre defined functional interfaces java.util.function - 

// return true/false - Predicate - functional interface
// return void - Consumer - 
// Mapper - input T, return R

// 2 questions with predefined interfaces
// 2 user made interfaces
// read about all predefined functional interfaces
