package AbstractClass;




abstract class Bank{    
   abstract int getRateOfInterest(); 
   int InterestS=7;
   int InterestA=8;
}


class SBI extends Bank{    
    int getRateOfInterest(){
    	return InterestS;
    }    
}

class Axis extends Bank{    
    int getRateOfInterest(){
	    return InterestA;
    }    
}    
    
class TestBank{    
public static void main(String args[]){    
   Bank b = new SBI();  
   System.out.println("Rate of Interest of SBI is : "+b.getRateOfInterest()+" %");    
   Bank a = new Axis();  
   System.out.println("Rate of Interest of AXIS is : "+a.getRateOfInterest()+" %");    
}
}    