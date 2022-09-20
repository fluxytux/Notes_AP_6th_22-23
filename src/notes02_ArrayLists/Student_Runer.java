package notes02_ArrayLists;

import java.util.ArrayList;

import notes01_basic_objects.Student;

/*
 * Notes ArraList<>
 * 
 *An Array of Objects
 *
 *
 *methods
 *    .add(<object>) = adds object to the end of the list 
 *    .add(<index>, <object>) = adds object to the list
 *            at the given index.  everything else is
 *            shifted down.
 *    .clear() = removes all items from list
 * 	  .get(<index>) = returns object at given index
 *    .remove(<index>) = removes item at given index
 *    .remove(<object>) = removes first occurrence of that object
 *    .size() = returns the number of elements in the list
 */

public class Student_Runer {

	public static void main(String[] args) {
		
		Student s1 = new Student(91234, "Fredalina", 2.5);
		Student s2 = new Student(0251, "Arnold", -4.9);
		Student s3 = new Student(57625, "Vishwas", 4.9);
		
		//Declaring an ArrayList
		//MUST have the object type
		ArrayList<Student> students;
		students = new ArrayList<Student>();
		
		//adding items
		students.add(s1);
		students.add(s3);
		
		//add to a specific index
		students.add(1, s2);
		
		//How to get an object from the list
		System.out.println(students.get(0));
		
		System.out.println("Print List:");
		printList(students);
		
		
		//Anonymous Objects
		//Objects with no variable
		students.add(new Student(748214, "Joe", 3.1));
		students.add(4, s1);
		students.add(students.get(3));
		
		System.out.println("Print List:");
		printList(students);
	
		
		//removing items
		//use index
		students.remove(2);
		System.out.println("Vishwas Gone:");
		printList(students);
		
		
		students.remove(students.get(4));
		System.out.println("1st Joe Gone:");
		printList(students);
		
		
		
		//erase the entire list
		students.clear();
		System.out.println("Clear List:");
		printList(students);
		System.out.println("They're gone");
		
	}
	
	
	public static void printList(ArrayList<Student> students) {
		System.out.println();
		for (int i = 0 ; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
		
	}
	
	
}
