package notes01_basic_objects;

public class Student_Runner {

	
	public static void main(String[] args) {
		
		int num = 5;
		
		Student s1 = new Student(91234, "Sam", 2.5);
		Student s2 = new Student(0251, "Arnold", -4.9);
		Student s3 = new Student(57625, "Vishwas", 3.9);
		
		System.out.println(s1.getName());
		System.out.println(s2.getName());
		System.out.println(s3.getName());
		
		System.out.println();
		
		s3.setName("Benedict");
		System.out.println(s1.getName());
		System.out.println(s2.getName());
		System.out.println(s3.getName());
		
		
		System.out.println();
		System.out.println("s3's GPA: " + s3.getGPA());
		s3.addGPA(-3);
		System.out.println("s3's GPA: " + s3.getGPA());
		
		
		
	}
	
	
	
	
}
