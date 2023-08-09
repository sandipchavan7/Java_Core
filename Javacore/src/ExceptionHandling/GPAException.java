package ExceptionHandling;

public class GPAException extends RuntimeException {
   public GPAException() {
	   System.out.println("GPA exception");
   }
   public GPAException(String Message) {
	   super(Message);
   }
}
