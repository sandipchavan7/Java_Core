package CollectionDemo;

import java.util.ArrayList;

public class ArrayListDemo4 {
	/*1. 	Create a customer class with properties like customerId, customerName, customerMobile, etc
	Create an ArrayList Object to represent 5 customer objects*/
	public static void main(String[] args) {
		ArrayList<Customer>arr = new ArrayList<>();
		arr.add(new Customer(111,"Will",9876543211l));
		arr.add(new Customer(222,"David",9876543212l));
		arr.add(new Customer(333,"Rahul",9876543213l));
		arr.add(new Customer(444,"Raj",9876543214l));
		arr.add(new Customer(555,"Ram",9876543215l));
		
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
	}

}
