package CollectionDemo;

import java.util.ArrayList;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		//ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> al = new ArrayList<>();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(100);
		int i = al.get(0);
		System.out.println(i);
		System.out.println(al);
		
		ArrayList<Double> al2 = new ArrayList<>();
		al2.add(35.2);
		al2.add(45.5);
		al2.add(80.5);
		System.out.println(al2);
		
		ArrayList<String> al3 = new ArrayList<>();
		al3.add("Java");
		al3.add("Python");
		System.out.println(al3);
		
		

		
	}
}
