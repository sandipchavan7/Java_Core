package MultiThreading;


class ThreadTask{
	void call(){
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


class CallThreadTask extends Thread{
	ThreadTask T1 ;
	CallThreadTask(ThreadTask t){
		 this.T1 = t;
   }
   
	public void run() {
		synchronized(T1) {
			T1.call();
		}
	}
}



public class SynchronizationBlock {
    public static void main(String[] args) {
    	ThreadTask TF = new ThreadTask();
    	CallThreadTask TF1 = new CallThreadTask(TF);
    	TF1.setName("Child Thread 1");
    	TF1.start();
    	CallThreadTask TF2 = new CallThreadTask(TF);
    	TF2.setName("Child Thread 2");
    	TF2.start();
    	
    }
}
