package notes01_basic_objects;

public class Student {

	/*
	 * Parameters / Instance Variables
	 * 
	 * declare only (unless it's static)
	 */
	private int idNum;
	private String name;
	private double gpa;
	
	
	/*
	 * Constructor 
	 * This builds the object 
	 * AND
	 * initializes all instance variables
	 */
	public Student(int idNum, String name, double gpa) {
		this.idNum = idNum;  
		this.name = name;
		this.gpa = gpa;
		
		/*
		 * this.
		 * refers to the Class's variable NOT the meathod's
		 */
	}
	/*
	 * Default Constructor
	 * 
	 * Yes you can have multiple constructors.
	 * 
	 * A Default Constructor has no parameters.  It sets the
	 *   instance variables to a "default" value.  (whatever
	 *   you want it to be)
	 */
	public Student() {
		idNum = 0;
		gpa = 0.0;
		name = "Unknown";
	}
	
	
	
	
	
	
	
	
	//METHODS
	
	
	/*
	 * Getter Methods
	 * 
	 * Literally...GETS.. the info
	 */
	public int getIdNum() {
		return idNum;
	}
	public String getName() {
		return name;
	}
	public double getGPA() {
		return gpa;
	}
	
	/*
	 * Mutator Methods
	 * They change the variable values
	 */
	public void setName(String newName) {
		this.name = newName;
	}
	public void setIdNum(int newIDNum) {
		this.idNum = newIDNum;
	}
	public void addGPA(double gpaChange) {
		gpa += gpaChange;
	}
	
	
	
	
	
	/*Overriding the toString() method
	 * 
	 */
	@Override
	public String toString() {
		return "Name:  " + name
		   + "\nID#:   " + idNum
		   + "\nGPA:   " + gpa + "\n";
	}
	
	
	
}
