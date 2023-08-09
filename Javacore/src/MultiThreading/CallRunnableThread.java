package MultiThreading;


class ChildThread2 implements Runnable{
	Thread T1;
	Thread T2;
	ChildThread2(){
		T1 = new Thread(this,"Child thread 1");
		T1.start();
		T2 = new Thread(this,"Child thread 2");
		T2.start();
	}
	@Override
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


public class CallRunnableThread {
     public static void main(String[] args) {
    	 new ChildThread2();
    	 }
}
