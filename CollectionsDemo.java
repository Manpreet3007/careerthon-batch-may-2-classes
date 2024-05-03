import java.util.*;

// given a sentence, print all the unique words in that sentence


class CollectionsDemo2 {

	public static void main(String args[]) {
	
		String sentence = "this is a repeated words string this is repeated 2 times";
		
		//StringTokenizer words = new StringTokenizer(sentence, " ");
		
		// next() - returns next token in the object, and moves the pointer to next element/token
		// hasNext() - returns true or false depending on if next token is present or not
		// countTokens() - total no of tokens
		
		//System.out.println(words.countTokens());
		//while(words.hasMoreTokens()) {
			//System.out.println(words.nextToken());
		//}
		
		// set to save unique words
		Set<String> uniqueWords = new HashSet<>();
		
		// get all words one by one and add in set
		//while(words.hasMoreTokens()) {
			//uniqueWords.add(words.nextToken());
		//}
		
		//System.out.println(uniqueWords.size());
		//System.out.println(uniqueWords);
	
	
		// given 2 matehmatical sets of integers(A and B), find their union(A U B). intersection(A B) and subtraction(A - B)
		
		// union of A and B means all elements in A and B but duplicate elements only once
		//A = {1, 2, 3} B = {3, 4, 5} AU B = {1, 2, 3, 4, 5}
		// A intersect B = {3}
		// A- B = {1, 2}
		
		Set<Integer> A = new HashSet<>();
		A.addAll(Arrays.asList(1, 2, 3));
		
		Set<Integer> B = new HashSet<>();
		B.addAll(Arrays.asList(3, 4, 5));
		
		// addAll , removeAll, retainAll 

		// union
		Set<Integer> unionOfAAndB = new HashSet<>();
		//A.addAll(B);
		
		// intersection
		//A.retainAll(B);
		
		// difference
		A.removeAll(B);
		//System.out.println(A);
		// iterator(), same as other common methods like add(), remove()
		
		// iterate through elements of collection - iterator() - this method return object of Iterator interface
		
		
		List<Object> numbers = new ArrayList<>();
		numbers.add("hello");
		numbers.addAll(Arrays.asList(1, 2000, 365, 408, 10, 35, 36, 47));
		
		int sum = 0;
		
		// sum of all nums
		
		Iterator<Integer> iterator = numbers.iterator();
		// hasNext() - true/false , next()
		
		//while(iterator.hasNext()) {
			//sum += iterator.next();
		//}
		
		//System.out.println(sum);
		
		// Collections class - utility method - static method - used to perform operations on collection 
		
		System.out.println(numbers);
		
		Collections.reverse(numbers);
		
		System.out.println("After reverse"+ numbers);
		
		//Collections.replace(numbers, 1, 200);
		
		Collections.sort(numbers, Collections.reverseOrder());
		
		Collections.fill(numbers, 1);
		
		System.out.println( numbers);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	}
}