package CollectionDemo;

import java.util.HashMap;

public class HashMapDemo {
      public static void main(String[] args) {
    	  //key=value
    	  //CourseName=duration
    	  HashMap<String,Integer> st = new HashMap<>(); 
    	  st.put("JavaFullStack", 500);
    	  st.put(".Net", 100);
    	  st.put("Python", 500);
    	  st.put(null, null);
    	  System.out.println(st);
    	  
    	  
    	  
      }
}
