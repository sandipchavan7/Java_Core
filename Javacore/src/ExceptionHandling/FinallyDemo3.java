package ExceptionHandling;

public class FinallyDemo3 {
    static int m1(int num1,int num2) {
    	try {
    		System.out.println("Try");
    		return (num1+num2);
    	}catch(Exception e) {
    		System.out.println("Catch");
    		return (num1*num2);
    	}
    	finally {
    		System.out.println("Finally");
    		return (num1/num2);
    	}
    }
    public static void main(String[] args) {
    	int result=m1(10,5);
    	System.out.println(result);
    }}
