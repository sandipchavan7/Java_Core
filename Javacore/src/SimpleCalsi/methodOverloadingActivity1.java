package SimpleCalsi;




class SimpleCalc{
	//define overloaded sum() method
	//sample sum()
	public static void sum(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	public static void sum(float num1, float num2) {
		System.out.println(num1+num2);
	}
	
	/*public static void sum(double num1, double num2) {
		System.out.println(num1+num2);
	}*/
	
	public static void sum(long num1, long num2) {
		System.out.println(num1+num2);
	}
}
public class methodOverloadingActivity1 {
	public static void main(String[] args) {
		SimpleCalc.sum(100,200);
		SimpleCalc.sum(100.0f, 200.0f);
		//SimpleCalc.sum(100.0d, 200.0d);
		SimpleCalc.sum(100L, 200L);
	}
}



