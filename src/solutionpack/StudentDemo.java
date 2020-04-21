package solutionpack;

public class StudentDemo {
	public static void main(String[] args) {
		Student.SchoolName = "DAV School";
		Student st1 = new Student(101,"Ashish","xyz");
		
		Student st2 = new Student(101,"Ashish","xyz");
		Student st3 = new Student(101,"Ashish","xyz");
		Student st4 = new Student(101,"Ashish","xyz");
		
	}
}

class Student{
	int rollNumber;
	String name;
	String address;
	int[] marks;
	String[] subjects;

	static String SchoolName;
	
	// initialize your instance varibales.
	// can we call one constructor to another constructor
	// constructor and method
	
	Student(int rollNumber, String name, String address){
		this(rollNumber,name,address,null);
		this.rollNumber = rollNumber;
		this.name = name;
		this.address = address;
	}
	
	Student(int rollNumber, String name, String address, int[] marks){
		this.rollNumber = rollNumber;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}
	
	Student(int rollNumber, String name, String address, int[] marks, String[] subjects){
		this.rollNumber = rollNumber;
		this.name = name;
		this.address = address;
		this.marks = marks;
		this.subjects = subjects;
	}
	
	public void study(String subject) {

	}

	public void exam(String subject, int marks) {

	}

}