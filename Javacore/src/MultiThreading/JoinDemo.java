package MultiThreading;



class ThreadDemo3 extends Thread{
	
  public void run() {
	  System.out.println(Thread.currentThread().getName());
	  System.out.println("First Statement");
	  
	  
	  try {
		  Thread.sleep(2500);
		  
	  }catch(Exception e) {
		  e.printStackTrace();	  
	 }
	  
	  System.out.println("Second Statement");
	  
  }
	
}




public class JoinDemo {
   public static void main(String[] args) {
	   ThreadDemo3 T1 = new ThreadDemo3(); 
	   ThreadDemo3 T2 = new ThreadDemo3();
	   T1.setName("Child Thread 1");
	   T2.setName("Child Thread 2");
	   T1.start();
	   System.out.println(T1.getName()+" Thread is Alive :"+T1.isAlive());
	   try {
		   T1.join();
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
	   T2.start();
	   System.out.println(T2.getName()+" Thread is Alive : "+T2.isAlive());
	   try {
		   T2.join();
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
	   System.out.println(T1.getName()+" Thread is Alive :"+T1.isAlive());
	   System.out.println(T2.getName()+" Thread is Alive : "+T2.isAlive());
   }
}
