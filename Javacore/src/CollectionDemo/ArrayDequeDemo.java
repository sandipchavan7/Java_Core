package CollectionDemo;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
	public static void main(String[] args) {
		ArrayDeque<Integer> q = new ArrayDeque<>();
		q.add(100);
		q.add(500);
		q.add(300);
		q.add(200);
		q.add(400);
		//q.add(null);
		System.out.println(q);
	}
}
