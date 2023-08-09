package CollectionDemo;

import java.util.TreeMap;

public class TreeMapDemo{
    public static void main(String[] args) {
  	  //key=value
  	  //CourseName=duration
  	  TreeMap<String,Integer> tm = new TreeMap<>(); 
  	  tm.put("JavaFullStack", 500);
  	  tm.put(".Net", 100);
  	  tm.put("Python", 500);
  	   tm.put("TE", null);
  	 //tm.put(null, 200); null keys are not allowed
  	  System.out.println(tm);
  	  
    } 
  	  
    }