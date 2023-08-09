package Composition;

public class StudentTest {
   public static void main(String[] args) {
	   Address studentAddress = new Address("Pune","Maharashtra","India");
	   Student s = new Student(111, "David",studentAddress);
	   System.out.println("Student Name :"+s.getStudentName());
	   System.out.println("Student Id :"+s.getStudentId());
	   System.out.println("Student Address :"+s.getStudentAddress());
	   
   }
}
