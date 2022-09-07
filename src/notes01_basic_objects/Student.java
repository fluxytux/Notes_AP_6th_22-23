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
	
	
	
	
	
	
	
	
	
}
