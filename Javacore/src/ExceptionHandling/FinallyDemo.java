package ExceptionHandling;

public class FinallyDemo {
   public static void main(String[] args) {
	   System.out.println("start");
	   System.out.println(10/5);
	   try {
		   System.out.println(10/0);
		   System.exit(0);
		   
		   
	   }catch(ArrayIndexOutOfBoundsException e) {
		   System.out.println(e);
	   }
	   finally {
	   System.out.println("end");
   }
}
}
