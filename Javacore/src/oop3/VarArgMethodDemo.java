package oop3;

import java.util.Arrays;

public class VarArgMethodDemo {
	public static void display(int...args) {
		System.out.println(Arrays.toString(args));
		
	}
	
	public static void display(float...args) {
		System.out.println(Arrays.toString(args));
		
	}
	
	public static void display(double...args) {
		System.out.println(Arrays.toString(args));
		
	}
	
	public static void display(long...args) {
		System.out.println(Arrays.toString(args));
		
	}
	
	public static void display(String...args) {
		System.out.println(Arrays.toString(args));
		
	}
	
	public static void main(String[] args) {
		display(11,22,33,44,55);
		display(11.1,22.2,33.3,44.4,55.5);
		display(11.1f,22.2f,33.3f,44.4f,55.5f);
		display("Python","Java","Angular");
	}
  
}
