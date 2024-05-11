

// Java 8 - lambda expressions, functional interface - static, default, Method reference,Optional class, Streams API

// Stream - interface 

// collection, array - iterable, 
// operations 


// List<Student>
// name, rollNo, standard 

// process - list of students data and return students whose rollno  is less than 15, ascending order rollNo

import java.util.*;
import java.util.function.*;
// student class - 3properties - rollno, name, standard
class Student {
	private String name;
	private int rollNo;
	private short standard;
	// getter setter 
	
	Student (int rollNo, String name, short standard){
		this.rollNo = rollNo;
		this.name = name;
		this.standard = standard;
	}
	
	String getName(){
		return this.name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	public int getRollNo(){
		return this.rollNo;
	}
	
	void setRollNo(int no) {
		this.rollNo = no;
	}
	
	short getStandard(){
		return this.standard;
	}
	
	void setStandard(short standard) {
		this.standard = standard;
	}
}

class StreamsDemo{
	public static void main(String args[]){
		Student student1 = new Student(1, "Aiditi", (short)12);
		Student student2 = new Student(2, "Anurag", (short)12);
		Student student3 = new Student(16, "Devesh", (short)12);
		
		// list of student to store all student objects
		List<Student> studentList = new ArrayList<>();
		
		studentList.add(student2);
		studentList.add(student1);
		studentList.add(student3);
		
		System.out.println("Before Operations");
		Iterator<Student> stIterable = studentList.iterator();
		
		while(stIterable.hasNext() ){
			Student s = stIterable.next();
			System.out.println(s.getRollNo() + " "+ s.getName() + " "+ s.getStandard());
		}
		
		
		//printStudentLessThan15Sorted(studentList);
		// doing same operations using streams
		
		// less than 15(condtional operation) - filter( Predicate ) - boolean test(Student t){return s.getRollNo() < 15;}
		
		//.sorted(comparing(Student::getRollNo).reversed())
			studentList.parallelStream()
			.filter(s ->  s.getRollNo() < 15)
			.map(s -> s.getRollNo()) // convert student to rollno 
			.forEach(
			// for each after map only has rollno of student and not complete student object
				//s -> System.out.println(s.getRollNo() + " "+ s.getName() + " "+ s.getStandard())
				// here s now itself is rollno
				s -> System.out.println(s)
			);
			
			/** normal for each loop
			for (Student s : studentList){
				
			}**/
		
		System.out.println("After Operations");
		Iterator<Student> stIterable2 = studentList.iterator();
		
		while(stIterable2.hasNext() ){
			Student s = stIterable2.next();
			System.out.println(s.getRollNo() + " "+ s.getName() + " "+ s.getStandard());
		}
		
	}
	
	// doing operations without using streams api
	static void printStudentLessThan15Sorted(List<Student> studentList){
		// find students who have roll no less than 15
		List<Student> newStudents = new ArrayList<>();
		
		// to check roll no less than 15 and adding in newStudent list
		for (Student student : studentList) {
			if (student.getRollNo() < 15) {
				newStudents.add(student);
			}
		}
		// sort based on roll no
		Collections.sort(newStudents, new Comparator<Student>(){
			public int compare(Student s1, Student s2){
				return s1.getRollNo() - s2.getRollNo();
			}
		});
		
		System.out.println("After Operations");
		Iterator<Student> stIterable = newStudents.iterator();
		
		while(stIterable.hasNext() ){
			Student s = stIterable.next();
			System.out.println(s.getRollNo() + " "+ s.getName() + " "+ s.getStandard());
		}
		
		
	}
}


