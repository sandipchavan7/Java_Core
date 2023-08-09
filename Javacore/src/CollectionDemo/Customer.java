package CollectionDemo;
/*1. 	Create a customer class with properties like customerId, customerName, customerMobile, etc
Create an ArrayList Object to represent 5 customer objects*/

public class Customer {
   private int customerId;
   private String customerName;
   private long customerMobile;
   
public int getCustomerId() {
	return customerId;
   }

public void setCustomerId(int customerId) {
	this.customerId = customerId;
}

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public long getCustomerMobile() {
	return customerMobile;
}
public void setCustomerMobile(long customerMobile) {
	this.customerMobile = customerMobile;
}

public Customer() {
	   super();
   }
    public Customer(int customerId, String customerName, long customerMobile) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.customerMobile = customerMobile;
}
    @Override
    public String toString() {
    	return("Name of Customer: "+customerName+"||  Customer Id :"+customerId+"||  Mobile No. of customer:"+customerMobile);
    }

   
}
