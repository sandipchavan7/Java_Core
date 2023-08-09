package CollectionDemo;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		System.out.println(al.size());

		al.add(100);
		al.add("Java");
		
		System.out.println(al.size());

		al.add(3.14);
		al.add(true);
		System.out.println(al.size());

		al.add('A');
		al.add(null);
		System.out.println(al);
		System.out.println(al.size());
		
		al.remove(0);
		System.out.println(al);
		System.out.println(al.size());
		
		al.remove("Java");
		System.out.println(al);
		System.out.println(al.size());
		
		al.add(2, "Python");
		System.out.println(al);
		
		Object obj = al.get(0);
		double d = (double)obj;
        System.out.println(d);
		
		Object obj2 = al.get(2);
		String s = (String) obj2;
		System.out.println(s);
		
		
		
	}
}

