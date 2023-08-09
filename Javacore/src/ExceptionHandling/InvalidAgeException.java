package ExceptionHandling;

public class InvalidAgeException extends Exception {
      public InvalidAgeException() {
    	  System.out.println("Zero argument constructor");
      }
      
      public InvalidAgeException(String Message) {
    	  super(Message);
      }
      
}
