package ConstructorDemo;

class Car{
	String ParentCompany;
	String CarName;
	int year;
	
	//constructor with no arguments
	public Car() {
		this.ParentCompany="";
		this.CarName="";
		this.year=0;
	}
	
	//constructor with one argument
	public Car(String ParentCompany) {
		
	        this.ParentCompany = ParentCompany;
	        this.CarName = "";
	        this.year = 0;
	}
	
	//constructor with two argument
	public Car(String ParentCompany,String CarName) {
		this.ParentCompany = ParentCompany;
        this.CarName = CarName;
        this.year = 0;
	}
	
	//Constructor with two argument
	public Car(String ParentCompany,String CarName,int year) {
		this.ParentCompany = ParentCompany;
        this.CarName = CarName;
        this.year = year;
	}
    
	 void display(){
		System.out.println("Car parent company :"+ParentCompany+", Car Name : "+CarName+", launch Year : "+year);
	}
}


public class DemoConstructor {
	public static void main(String[] args) {
		Car car1 = new Car();
        Car car2 = new Car("Toyota");
        Car car3 = new Car("Honda", "Civic");
        Car car4 = new Car("Ford", "Mustang", 2022);
        car1.display();
        car2.display();
        car3.display();
        car4.display();
        
		
	}
}


