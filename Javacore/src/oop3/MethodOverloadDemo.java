package oop3;

class Calc {
	   public static int maxValue(int num1,int num2) {
		int max = num1>num2 ? num1 : num2;
		return max;   
	   }
	   
	   public static double maxValue(double num1,double num2) {
		   double max = num1>num2 ? num1 : num2;
		   return max;
	   }
	   
	   public static long maxValue(long num1,long num2) {
		   long max = num1>num2 ? num1 : num2;
		   return max;
	   }
}

public class MethodOverloadDemo {
   public static void main(String[] args) {
	   System.out.println(Calc.maxValue(1233433l,45323434l));
   }
}
