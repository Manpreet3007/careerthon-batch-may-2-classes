import java.util.*;

// root - Iterable
// Collection interface


// Collection - grp of items
// collection framework - java.util package - classes and interface  
// Collection interface - root interface of one heirarchy 
// Collections class - utility class static methods that can be used with collection objects

// Iterable (I)
// Collection (I)
	// List (I) - normal collection, access element, iterate, 
		// ArrayList (C) - backend implementation through array - more read operations - O(1)
		// LinkedList (C) - backend implementation through link list - write operations linked - O(1)
		// Vector (C) - same but thread safe 
			// Stack (C) - LIFO(last in first out) property
	// Set (I) - uniqueness 
		// SortedSet (I) - order maintain - ascending
			// TreeSet (C) - sorted set implemented  - backend implementation through tree
		// LinkedHashSet (C) - link list
		// HashSet (C) - set 
	// Queue (I) - FIFO (first in first out) 
		// PriorityQueue (C) - implementation of queue
		// Deque (I) - double ended queue - elements can be added and removed from both ends of queue 
			// ArrayDeque (c)  - impelemtation
			
// common method - to add element - add(), to remove - remove(), clear() - to remove all
// , to access elemnt at particular location/index - get(), no of elements - size();, addAll()


// to generate 10 random integers(1- 100) and print all even integers

public class CollectionDemo {
	
	public static void main(String args[]){
		/**
		// int nums[] = new int[10];
		//collection
		// create list 
		Stack<Integer>  nums = new Stack<>();
		//Set<Integer> nums = new HashSet<>();
		
		// generate random number - Math.random() - 0 - 1 - values generate
		for (int i = 0; i< 10; i++){
			int randomValue = ((int)(Math.random() * 100) + 1);
			nums.add(randomValue);
		}
		
		System.out.println(nums);
		
		
		// print even 
		for (int i = 0; i < 10; i++){
			if (nums.get(i) % 2 == 0) {
				System.out.println(nums.get(i));
			}
		}
		
		// make list empty
		nums.clear();
		System.out.println(nums);
		**/
		// Set
		// Given 2 lists, find the no of unique elements in that list 
		// Given list of names of students who came to college on monday and tuesday,
		//print the names of students who came to college atleast one of those days
		
		// list of students who cam e on monday
		/**List<String> mondayNames = new ArrayList<>();
		mondayNames.add("Ramesh");
		mondayNames.add("Suresh");
		// list of students who came on tuesday 
		List<String> tuesdayNames = new LinkedList<>();
		tuesdayNames.add("ramesh");
		tuesdayNames.add("Mukesh");
		
		
		
		// names of students who came on atleast one day
		Set<String> namesOfstudents = new HashSet<>();
		namesOfstudents.addAll(mondayNames);
		namesOfstudents.addAll(tuesdayNames);
		
		
		// unique - different - how set knows that element is unique? - equals - true, false
		
		System.out.println(namesOfstudents);**/
		
		Student s1 = new Student(1, "Rahul");
		Student s2 = new Student(2, "Rahul");
		
		Set<Student> studentSet = new HashSet<>();
		
		studentSet.add(s1);
		studentSet.add(s2);
		
		System.out.println(studentSet);
		
		
		
			
	}
}

// to demonstrate how set uses equals internally

class Student {
	int id;
	String name;
	public Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public boolean equals(Object o){
		Student s = (Student ) o;
		return  this.name.equals(s.name) ;
	}
	
	public int hashCode(){
		return this.name.hashCode();
	}
}



