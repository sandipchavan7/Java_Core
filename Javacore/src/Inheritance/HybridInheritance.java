package Inheritance;


class a{
	public void M1() {
		System.out.println("M1.....");
	}
}

class b extends a{
	public void M2() {
		System.out.println("M2.....");
	}
}
class c extends b{
	public void M3() {
		System.out.println("M3.....");
	}
}
class d extends c{
	public void M4() {
		System.out.println("M4.....");
	}
}
class e extends c{
	public void M5() {
		System.out.println("M5.....");
	}
}
public class HybridInheritance {
    public static void main(String[] args) {
    	d d1 = new d();
    	d1.M4();
    	d1.M3();
    	d1.M2();
    	d1.M1();
    	e e1 = new e();
    	e1.M5();
    	e1.M3();
    	e1.M2();
    	e1.M1();
    	
    }
}
