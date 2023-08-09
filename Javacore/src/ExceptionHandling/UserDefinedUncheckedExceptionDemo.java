package ExceptionHandling;

import java.util.Scanner;

public class UserDefinedUncheckedExceptionDemo {
    public static void main(String[] args) throws GPAException{
    	Scanner in = new Scanner(System.in);
    	System.out.println("Enter your GPA");
    	double gpa = in.nextDouble();
    	if(gpa>=5) {
    		System.out.println("You are elligible for admission");
    	}
    	else if(gpa<5) {
    		throw new GPAException("You are not elligible for the admission better luck next time");
    	}
    }
}
