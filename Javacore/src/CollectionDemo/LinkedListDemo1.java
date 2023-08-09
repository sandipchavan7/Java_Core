package CollectionDemo;

import java.util.LinkedList;
/*2.	Create a customer class with properties like customerId, customerName, customerMobile, etc
	Create an LinkedList Object to repesent 5 customer objects*/
public class LinkedListDemo1 {
   public static void main(String[] args) {
	   LinkedList<Customer> arr1 = new LinkedList<>();
	    arr1.add(new Customer(111,"Will",9876543211l));
		arr1.add(new Customer(222,"David",9876543212l));
		arr1.add(new Customer(333,"Rahul",9876543213l));
		arr1.add(new Customer(444,"Raj",9876543214l));
		arr1.add(new Customer(555,"Ram",9876543215l));
		for(int i=0;i<arr1.size();i++) {
			System.out.println(arr1.get(i));
		}
   }
}
