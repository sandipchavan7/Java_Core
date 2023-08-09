package oop1;

class Parent{
	int i = 10;
	int j = 20;
	int x = 111;
	
	public void wish() {
		System.out.println("hello...");
	}
}
class Child extends Parent{
	int i = 100;
	int j = 200;
	int x = 222;
	
	public void wish() {
		System.out.println("hi...");
	}
	
	public void m1(int i, int j) {
		System.out.println(i+j);
		System.out.println(super.i + super.j);
		System.out.println(this.i + this.j);
		System.out.println(super.x);
		//System.out.println();
		this.wish();
		super.wish();//hello or hi
		
	}
}
public class Test {
	public static void main(String[] args) {
		Child c = new Child();
		c.m1(1000, 2000);//3000 or 300 or 30
	}
}