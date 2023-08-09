package CollectionDemo;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(100);
		ll.add(500);
		ll.add(300);
		ll.add(500);
		System.out.println(ll);
		
		ll.addFirst(111);
		ll.addLast(999);
		System.out.println(ll);
		ll.removeFirst();
		System.out.println(ll);
		
		ll.removeLast();
		System.out.println(ll);
	}
}
