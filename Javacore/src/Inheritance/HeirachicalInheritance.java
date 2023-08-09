package Inheritance;

class Car{
	int wheels;
	int headLights;
	String modelNo;
	public Car(int wheels, int headLights,String modelNo) {
		this.wheels=wheels;
		this.headLights=headLights;
		this.modelNo=modelNo;
	}
	public void Start(){
		System.out.println("Starting the Car.....");
		
	}
	public void Move(){
		System.out.println(" the Car is Moving.....");
		
	}
	public void PressBreak(){
		System.out.println("Stoping the Car.....");
		
	}
}

class Audi extends Car{
	public Audi(int wheels, int headLights,String modelNo) {
		super(wheels,headLights,modelNo);
	}
	
	public void  AutoPilot() {
		System.out.println("Auto Pilot.....");
	}
}

class Ferrari extends Car{
	public Ferrari(int wheels, int headLights,String modelNo) {
		super(wheels,headLights,modelNo);
	}
	public void  SportModel() {
		System.out.println("Sport  Model.....");
	}
	
	
}



public class HeirachicalInheritance {
   public static void main(String [] args) {
	   System.out.println(".......car.......");
	   Car c = new Car(4,2,"M1234");
	   c.Start();
	   c.Move();
	   c.PressBreak();
	   
	   System.out.println(".......Audi.......");
	   Audi a = new Audi(4,2,"S0007");
	   a.Start();
	   a.Move();
	   a.PressBreak();
	   a.AutoPilot();
	   
	   System.out.println(".......Ferrari.......");
	   Ferrari f = new Ferrari(4,2,"F005");
	   f.Start();
	   f.Move();
	   f.PressBreak();
	   f.SportModel();
	   
   }
}
