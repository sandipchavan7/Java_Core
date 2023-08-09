package CollectionDemo;

import java.util.ArrayList;

public class ArrayListDempo3 {
	public static void main(String[] args) {
		ArrayList <Employee> employees = new ArrayList<>();
		employees.add(new Employee("XYZ",111,98765432371L));
		employees.add(new Employee("ABC",222,98765432372L));
		employees.add(new Employee("RTY",333,98765432373L));
		employees.add(new Employee("UIO",444,98765432374L));
		
		
		for(int i = 0;i<employees.size();i++) {
			System.out.println(employees.get(i));
		}
		for(int i = 0;i<employees.size();i++) {
			System.out.println(employees.get(i));
		}
		
	}
}
