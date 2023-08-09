package GarbageCollectionDemo;

class Employee{
	
	int employeeId;
	String employeeName;
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}
	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
	@Override
	public void finalize() {
		System.out.println("Finalize...");
	}
}




public class Demo1 {
   public static void main(String[] args) {
	   Employee e1 = new Employee(111,"Will Smith");
	   Employee e2 = new Employee(222,"David Smith");
	   Employee e3 = new Employee(333,"Raaj");
	   System.out.println(e1);
	   e2 = e1;
	   
	   
	   System.gc();
	   
   }
}
