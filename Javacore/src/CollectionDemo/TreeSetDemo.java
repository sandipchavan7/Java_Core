package CollectionDemo;
import java.util.TreeSet;
public class TreeSetDemo {
    public static void main(String[] args) {
    	TreeSet<Integer> ts = new TreeSet<>(new MyIntegerComparater());
    	ts.add(600);
    	ts.add(200);
    	ts.add(500);
    	ts.add(300);
    	ts.add(100);
    	
    
    TreeSet<Double> ts1 = new TreeSet<>(new MyDoubleComparator());
	ts1.add(600.3);
	ts1.add(200.34);
	ts1.add(500.34);
	ts1.add(300.56);
	ts1.add(null);
	System.out.println(ts1);
	System.out.println(ts);
}
    

    
}
