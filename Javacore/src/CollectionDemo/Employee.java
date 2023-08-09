package CollectionDemo;

public class Employee {
	
	private String EmployeeName;
	private int EmployeeId;
	private long EmloyeeMobNO;
	public Employee() {
		super();
	}
	public Employee(String employeeName, int employeeId, long emloyeeMobNO) {
		super();
		EmployeeName = employeeName;
		EmployeeId = employeeId;
		EmloyeeMobNO = emloyeeMobNO;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public long getEmloyeeMobNO() {
		return EmloyeeMobNO;
	}
	public void setEmloyeeMobNO(long emloyeeMobNO) {
		EmloyeeMobNO = emloyeeMobNO;
	}
	@Override
	public String toString() {
		return "Employee [EmployeeName=" + EmployeeName + ", EmployeeId=" + EmployeeId + ", EmloyeeMobNO="
				+ EmloyeeMobNO + "]";
	}
	
	
	
	

}
