
// Map root class - map - DSA
// Map - pair - key, value

// 1 -> "Anurag"
// 2 -> "Amisha"



//Map<K, V>
	// HashMap
	// LinkedHashMap
	// SortedMap(I)
		// TreeMap(c)

// 1 -> "Anurag"
// 2 -> "Anurag"

//put(1, "Anurag");
//put(1, "Amisha");

// get(1) -> "Amisha"

// key - unique
// vlaue - non unique 
// methods - put(key, value), getValue(key) -> value

// put - add new key vlaue, update value of key if already present 
// get(key) - returns corresponding value of key 
// tree map - keys are sorted
// iterate - entrySet() - Entry - single key value pair - entry 
// - entrySet() - {1=Anurag,
// 2=Amisha,
// 3=Bhanu}

// containsKey(key) - true/ false
import java.util.*;

class MapDemo {
	
	public static void main(String args[]){
		
		/**
		Map<Integer, String> rollNameMap = new HashMap<>();
		
		rollNameMap.put(1, "Anurag");
		//rollNameMap.put(1, "Amisha"); // update
		rollNameMap.put(2, "Amisha");
		rollNameMap.put(3, "Bhanu");
		
		System.out.println(rollNameMap);
		
		System.out.println(rollNameMap.get(2));
		
		// iterate through Map using entryset() method in for each loop
		// entry is another interface inside Map interface
		// entry means a pair of key value
		
		for (Map.Entry<Integer, String> entry : rollNameMap.entrySet()){
			System.out.println("Key = "+entry.getKey() + " value = "+ entry.getValue());
		}
		
		// if we only want to iterate through keys - keySet()
		
		for (Integer key : rollNameMap.keySet()) {
			System.out.println(key);
		}
		**/
		
		// count no of total alphabets and print their count in given string
		// "aabddde" o/p - a - 2, b - 1, d - 3, e - 1
		// output - sorted - TreeMap - by default keys sorted 
		// all characters will be lower cse, count only for those chars that are present in input
		
		String alphabets = "bbcccadoo";
		
		// key(unique - alphabet) ? - Character   
		// value(count of alphabet - non unique) ? - Integer 
		
		
		Map<Character, Integer> alphabetCountMap = new TreeMap<>();
		/**{
			b - 2,
			c - 3,
			a - 1
		}**/
		
		
		
		// get all alphabets from variable one by one 
		for(int i = 0; i < alphabets.length(); i++) {
			
			char alphabet = alphabets.charAt(i); 
			
			if (alphabetCountMap.containsKey(alphabet)) {
				// when alphabet is already present, get the exisiting count(value)
				int existingCountOfAlpha = alphabetCountMap.get(alphabet);
				// now add 1 and update the count
				alphabetCountMap.put(alphabet, existingCountOfAlpha + 1); // update
				
			} else {
				// when alphabet is not already present in map, it's value(count) will be initialized as 1
				alphabetCountMap.put(alphabet, 1);
			}
		}
		
		System.out.println(alphabetCountMap);
			// iterate through all enteries and print key and value
		/**for (Map.Entry<Character, Integer> entry : alphabetCountMap.entrySet()){
			
			System.out.println("Alphabet "+ entry.getKey() +" is present " + entry.getValue() + " times");
			
		}**/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}



