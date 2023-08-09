package Inheritance;


class Mobile{
	public void VoiceCall() {
		System.out.println("Voice call...");
	}
	
	public void msg() {
		System.out.println("Messages...");
	}
}

class SmartMobile extends Mobile{
	public void VideoCall() {
		System.out.println("Video call...");
	}
	
	public void Internet() {
		System.out.println("Internet...");
	}
}

public class SingleInheritance {
     public static void main(String[] args) {
    	 Mobile m = new Mobile();
    	 m.VoiceCall();
    	 m.msg();
    	  
    	SmartMobile sm = new SmartMobile();
    	sm.VoiceCall();
   	    sm.msg();
   	    sm.VideoCall();
	    sm.Internet();
     }
}
