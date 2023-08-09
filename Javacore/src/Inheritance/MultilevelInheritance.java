package Inheritance;

class Java5{
	public void Feature1(){
		System.out.println("Feature1....");
	}
}
class Java8 extends Java5{
	public void Feature2(){
		System.out.println("Feature2....");
	}
}
class Java10 extends Java8{
	public void Feature3(){
		System.out.println("Feature3....");
	}
}
class Java20 extends Java10{
	public void Feature4(){
		System.out.println("Feature4....");
	}
}


   class MultilevelInheritance {
     public static void main(String[] args) {
    	 Java20 j = new Java20();
    	 j.Feature1();
    	 j.Feature2();
    	 j.Feature3();
    	 j.Feature4();
     }
}
