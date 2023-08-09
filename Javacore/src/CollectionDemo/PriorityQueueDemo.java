package CollectionDemo;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<Integer> q = new PriorityQueue<>();
		q.add(100);
		q.add(500);
		q.add(300);
		q.add(200);
		q.add(400);
		System.out.println(q);
		
		q.poll();
		System.out.println(q);
		
		System.out.println(q.peek());
	}
}