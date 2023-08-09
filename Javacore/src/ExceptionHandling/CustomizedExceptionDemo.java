package ExceptionHandling;
import java.util.Scanner;
public class CustomizedExceptionDemo {
    public static void main(String[] args0) throws InvalidAgeException {
    	Scanner in = new Scanner(System.in);
    	System.out.println("Enter your name");
    	String name = in.next();
    	System.out.println("Enter your age");
    	int age = in.nextInt();
    	
    	if(age>=25 && age<=40) {
    		System.out.println(name +"you are elligible for marrige");
    	}
    	else if(age>40) {
    	   throw new InvalidAgeException(name +" you are not elligible for marrige as your age is crossed the limit");
    	}
    	else {
    		throw new InvalidAgeException(name+ "you are not crosedd age limit to get married");
    	}
    }
}
