

class BankAccount{
	//All properties are private i.e. tightly encapsulated class
	private int accountNumber;
	private String customerName;
	private double Balance;
	
	public void setaccountNumber(int accountNumber) {
		this.accountNumber=accountNumber;
	}
	
	public int getaccountNumber() {
		return accountNumber;
	}
	
	public void setcustomerName(String customerName) {
		this.customerName=customerName;
	}
	
	public String getcustomerName() {
		return customerName;
	}
	
	public void setBalance(double Balance) {
		this.Balance=Balance;
	}
	
	public double getBalance() {
		return Balance;
	}
	
	
}


public class EncapsulationActivity {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		
		ba.setaccountNumber(12345678);
		ba.setcustomerName("David");
		ba.setBalance(26345.98);
		System.out.println("Customer name: "+ba.getcustomerName()); 
		System.out.println("Account number of customer: "+ba.getaccountNumber());
		System.out.println("Balance in account : "+ba.getBalance());
		
	}

}
