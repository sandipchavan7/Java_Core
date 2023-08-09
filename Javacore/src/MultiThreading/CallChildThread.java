package MultiThreading;
import java.lang.Thread;

class ChildThread extends Thread{
   public void run() {
	   for(int i = 1;i<=10;i++) {
	       System.out.println(Thread.currentThread().getName()+" "+i);
	       try {
				Thread.sleep(2500);
			  } catch (InterruptedException e) {
				e.printStackTrace();
			  }
	 }
	   
   }
}


public class CallChildThread{
	public static void main(String[] args) {
		ChildThread ct = new ChildThread();
		ChildThread ct1 = new ChildThread();
		ct.start();
		ct1.start();
		
		ct.setName("Child Thread 1");
		ct1.setName("Child Thread 2");
		
	}
}