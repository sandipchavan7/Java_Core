package CollectionDemo;

import java.util.HashSet;
/*3.	Create a customer class with properties like customerId, customerName, customerMobile, etc
	Create an HashSet Object to represent 5 customer objects*/

public class HashSetDemo2 {
	public static void main(String[] args) {
		   HashSet<Customer> arr2 = new HashSet<>();
		    arr2.add(new Customer(111,"Will",9876543211l));
			arr2.add(new Customer(222,"David",9876543212l));
			arr2.add(new Customer(333,"Rahul",9876543213l));
			arr2.add(new Customer(333,"Rahul",9876543213l));
			arr2.add(new Customer(333,"Raj",9876543214l));
			arr2.add(new Customer(555,"Ram",9876543215l));
			for(Customer c : arr2) {
				System.out.println(c.toString());
			}
	   }
}
