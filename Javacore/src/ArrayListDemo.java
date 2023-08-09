import java.util.ArrayList;
public class ArrayListDemo {
     public static void main(String[] args) {
    	 ArrayList al = new ArrayList();  
    	 System.out.println(al.size());
    	 al.add("Java");
    	 al.add(100);
    	 al.add("True");
    	 al.add(3.14);
    	 al.add(100);
    	 System.out.println(al.size());
    	 System.out.println(al);
    	 al.remove(1);
    	 System.out.println(al.size());
    	 System.out.println(al);
    	 al.add(0,"Python");
    	 System.out.println(al);
    	 al.add(2,"C");
    	 System.out.println(al);
    	 
    	 Object obj = al.get(0);
    	 String d = (String)obj;
    	 System.out.println(d);
    	 
   }
}
