package week3.day1;

//Overloading exercise
public class Students {
	
	public void getStudentInfo(int id) {

	}
	
	public void getStudentInfo(int id, String name) {
		
	}
	
	public void getStudentInfo(String email, long phoneNumber) {
		

	}
	public static void main(String[] args) {
		
		Students getdata = new Students();
		
		getdata.getStudentInfo(123);
		getdata.getStudentInfo(123, "stud1");
		getdata.getStudentInfo("abc@gmail.com", 816812812792L);
		

	}

}
