package ExceptionHandling;

public class ThrowsDemo {
  public void m1() throws InterruptedException {
	  System.out.println("hello");
	  
	  Thread.sleep(2000);
	  
	  
	  System.out.println("Java");
  }
  public void m2() throws InterruptedException {
	  m1();
  }
  public  void m3() throws InterruptedException {
	  m2();
  }
  
  public static void main(String[] args) throws InterruptedException{
	  new ThrowsDemo().m3();
  }
  

  
}
