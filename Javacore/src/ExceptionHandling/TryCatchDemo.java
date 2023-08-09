package ExceptionHandling ;
//import java.io.InputStream;
//import java.util.InputMismatchException;
import java.util.Scanner;
public class TryCatchDemo {
   public static void main(String[] args) {
	   Scanner in  = new Scanner(System.in);
	   
	   /*while(true) {
	   try {
		   System.out.println("Enter a number");
		   String input = in.next();
		   int num = Integer.parseInt(input);
		   System.out.println("Square of "+num+" is "+num*num);
		   break;
	   }catch(NumberFormatException e) {
		   System.out.println("Only numbers are allowed");
		   
	  }*/
	   
		   try {
			   System.out.println(10/0);
			   System.out.println(10/5);
			  
		   }catch(ArithmeticException e) {
			   System.out.println("Cannot devide by zero");
			   
		  }
		   
		    
	   
	    
   }


}

