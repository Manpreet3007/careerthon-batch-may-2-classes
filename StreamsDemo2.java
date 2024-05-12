
// collection framework ->  List, Set, Queue 
// Map -> HashMap, SortedMap
// Functional interface -> lambda expressions

// Streams API -> methods to process collections, arrays or any iterables
import java.util.*;
import java.util.stream.*;

class StreamsDemo2 {
	
	public static void main(String args[]){
		
		List<Integer> intList = new ArrayList<>();
		
		intList.addAll(Arrays.asList(2));
		
		System.out.println(intList);
		
		// collection -> Streams -> streams()
		// streams - 2 types of methods  - intermediate(Stream) and terminal(anything else apart from stream)
		
		
		/**
		// print all even no in this list
		intList.stream() // list converted to stream 
				 .filter( (num) -> num % 2 ==0) // 392, 39732, 54 if lambda expression returns true -> then object will go further else it will be remvoed from stream
				 .forEach( (x) ->  System.out.println(x)); // forEach - terminal operation
				//.map()**/

		//System.out.println(intList);

		// filter - condition basis, objects filter, true -> false will be discareded
		// forEach - terminal operation - > void return 
		
		/**
		intList.stream() // list converted to stream 
				 .filter( (num) -> num > 100) 
				 .forEach( (x) ->  System.out.println(x));**/
		
		// list, find odd numbers and store their squares in a new list 
		
		List<Integer> newSqauredList = intList.stream() // list converted to stream 
																	.filter((num ) -> num %2 == 1) // odd numbers 
																	.map((oddNums) -> oddNums * oddNums) // intermidiate operation - input x return y
																	.limit(5)
																	.collect(Collectors.toList()); // terminal operation, return List
		//System.out.println(newSqauredList);
		
		
		// reduce -> streams convert to a single value
		// sum of all integers in the list
		
		// intitial value = 0
		int sum = intList.stream() 
				  .reduce(1, (a, b) -> a *b); // terminal method -> int 
				  
		
		// findAll, findAny
		
		// from the list, print any even number
		Optional<Integer> evenNum = intList.stream() // stream 
												.filter (x -> x % 2 ==0 ) // even numbers 
												.findAny(); // if any value is found in the stream it will return it
		
		//System.out.println(evenNum.isPresent() ? evenNum.get() : "No Even Number Found");
		
	/**
		if ( intList.stream().allMatch( (x) -> x %2 == 1)) { // if all elements meet this condition then all match return s true else false
			System.out.println("All elements in the list are odd");
		} else {
			System.out.println("All elements in the list are not odd");
		}
		**/

		if ( intList.stream().anyMatch( (x) -> x %2 == 1)) { // if any one element meets this condition then all match return s true else false
			System.out.println("Atleat one element in the list is odd");
		} else {
			System.out.println("No elements in the list are odd");
		}
		
				  
		//System.out.println(sum);
		
		
		
		
		// filter, map, collect, forEach, reduce 
			
		//System.out.println(newSqauredList);
		
		// filter, reduce, foreach, map, findAny(), findFirst(), allMatch(), anyMatch(), 
		
		
	}
	
}

