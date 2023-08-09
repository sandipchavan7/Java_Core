package CollectionDemo;

import java.util.HashSet;

public class HashSetDemo1 {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(400);
		hs.add(200);
		hs.add(100);
		hs.add(300);
		//hs.add(200);
		System.out.println(hs);
	}
}
