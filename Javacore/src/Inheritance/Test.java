package Inheritance;

class Student{
	int studentId;
	String studentName;
	int studentMarks;
	public Student(int studentId, String studentName, int studentMarks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}


	public void displayStudent() {
		System.out.println("Student");
		
	}
}

class EngineeringStudent extends Student{
	String studentBranch;
	double studentGPA;
	public EngineeringStudent(int studentId, String studentName, int studentMarks,String studentBranch,double studentGPA) {
		super(studentId, studentName, studentMarks);
		this.studentBranch=studentBranch;
		this.studentGPA=studentGPA;
	}

	
	
	public void displayStudent() {
		super.displayStudent();
		System.out.println("Engineering Student");
		
	}
}




public class Test {
    public static void main(String[] args) {
    	EngineeringStudent es = new EngineeringStudent(1,"ALEX",400,"CSE",9.2);
    	es.displayStudent();
    	System.out.println("Name of Student :"+es.studentName);
		System.out.println("Student Id : "+es.studentId);
		System.out.println("Marks obtained: "+es.studentMarks);
		System.out.println("Student Branch: "+es.studentBranch);
		System.out.println("Student GPA: "+es.studentGPA);
		
    	
    }
}
