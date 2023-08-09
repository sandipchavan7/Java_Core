package OverloadingActivity2;

class CreditCard{
	public String payment() {
		return "CreditCard";
	}
}
class DebitCard{
	public String payment() {
		return "DebitCard";
	}
}
class UPI{
	public String payment() {
		return "UPI";
	}
}

class PaymentProcessSystem{
	public static void completePayment(double amount, CreditCard cc) {
		System.out.println("Amount: "+amount);
		System.out.println("Mode of Payment: "+cc.payment());
		System.out.println("Status: complete");
	}
	public static void completePayment(double amount, DebitCard dc) {
		System.out.println("Amount: "+amount);
		System.out.println("Mode of Payment: "+dc.payment());
		System.out.println("Status: complete");
	}
	public static void completePayment(double amount, UPI upi) {
		System.out.println("Amount: "+amount);
		System.out.println("Mode of Payment: "+upi.payment());
		System.out.println("Status: complete");
	}
}
public class MethodOverloadingActivity1 {
	public static void main(String[] args) {
		PaymentProcessSystem.completePayment(10000.0, new CreditCard());
		System.out.println("=======================");
		PaymentProcessSystem.completePayment(20000.0, new DebitCard());
		System.out.println("=======================");
		PaymentProcessSystem.completePayment(50000.0, new UPI());
	}
}