package oop2;

class Customer{
	int customerId;
	String customerName;
	String customerEmail;
	public Customer() {
		System.out.println("Customer object created");
	}
	public Customer(int customerId){
		this.customerId=customerId;
	}
	public Customer(int customerId,String customerName){
		this.customerId=customerId;
		this.customerName=customerName;
	}
	public Customer(int customerId,String customerName,String customerEmail){
		this.customerId=customerId;
		this.customerName=customerName;
		this.customerEmail=customerEmail;
	}



public String toString() {
	return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerEmailId="
			+ customerEmail + "]";
}
}
public class Test {
public static void main(String[] args) {
	Customer c = new Customer(101);
	System.out.println(c);
}
}
