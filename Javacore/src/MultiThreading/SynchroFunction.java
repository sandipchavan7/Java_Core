package MultiThreading;

class ThreadTask1{
	synchronized void call(){
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
class CallThreadTask1 extends Thread{
	ThreadTask1 T1 = new ThreadTask1() ;
	CallThreadTask1(ThreadTask1 t){
		 this.T1 = t;
   }
   
	public void run() {
		
			T1.call();
		
	}
}



public class SynchroFunction {
    public static void main(String[] args) {
    	ThreadTask1 TF = new ThreadTask1();
    	CallThreadTask1 TF1 = new CallThreadTask1(TF);
    	TF1.setName("Child Thread 1");
    	TF1.start();
    	CallThreadTask1 TF2 = new CallThreadTask1(TF);
    	TF2.setName("Child Thread 2");
    	TF2.start();
    	
    }
}







