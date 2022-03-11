package week3.day1;

public class Student extends Department {
	
	public void studentName() {
		
		System.out.println("print the student name - Student");

	}
	
	public void studentDept() {
		
		System.out.println("print the student department - Student");

	}
	
	public void studentId() {
		
		System.out.println("Print the student id - Student");

	}

	public static void main(String[] args) {
		
		Student results = new Student();
		
		//Accessing College class
		results.collegeName();
		results.collegeCode();
		results.collegeRank();
		
		//Accessing Department class
		results.deptName();
		
		//Accessing Student class(own class)
		results.studentName();
		results.studentDept();
		results.studentId();
		

	}

}
