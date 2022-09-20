package notes02_ArrayLists;

public class Student {

	//instance variables (parameters)
	private double gpa;
	private int idNum;
	private String name;
	
	
	/*
	 * Constructor
	 * 
	 * Builds the object in memory
	 * 
	 * initializes all parameters (instance variables)
	 */
	public Student(double gpa, int idNum, String name) {
		this.gpa = gpa;   //this.  refers to the class's gpa not the one in the parameter
		this.idNum = idNum;
		this.name = name;
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
		gpa = 0.0;
		idNum = 0;
		name = "No Name";
	}
	public Student(int idNum, String name) {
		this.gpa = 0.0;   
		this.idNum = idNum;
		this.name = name;
	}
	
	//any other method
	
	//getter methods
	public double getGPA() {
		return gpa;
	}
	public int getIDNum() {
		return idNum;
	}
	public String getName() {
		return name;
	}
	
	//mutator methods (setter methods)
	public void setName(String name) {
		this.name = name;
	}
	public void setIDNum(int newID) {
		this.idNum = newID;
	}
	public void addGPA(double ammount) {
		this.gpa += ammount;
	}
	
	
	
	/*
	 * toString() method
	 */
	@Override
	public String toString() {
		return "Name: " + name
		 	 + "\nID#:  " + idNum
		 	 + "\nGPA:  " + gpa;
	}
	
}
