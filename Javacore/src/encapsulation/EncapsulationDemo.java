package encapsulation;

/*
Q.1 Is Class A tightly encapsulated class?
A. yes

Q.2 Is Class B tightly encapsulated class?
A. No

Q.3 Is Class C tightly encapsulated class?
A. No
*/

class A{
	private int a;
}
class B extends A{
	int b;
}
class C extends B{
	private int c;
}

//Tightly Encapsulated class
class Student{
	private int studentId;
	private String studentName;
	private double studentMarks;
	
	//Getter and Setter methods
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public int getStudentId() {
		return this.studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(double studentMarks) {
		this.studentMarks = studentMarks;
	}	
}
public class EncapsulationDemo {
	public static void main(String[] args) {
		Student s = new Student();
		s.setStudentId(101);
		s.setStudentName("Sai");
		s.setStudentMarks(99);
		
		System.out.println("Student Id: "+s.getStudentId()); 
		System.out.println("Student Name: "+s.getStudentName());
		System.out.println("Student Marks: "+s.getStudentMarks());
	}
}