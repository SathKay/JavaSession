package basics;

public class MethodChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodChaining p1 = new MethodChaining();
		p1.method1();

	}
	
	public void method1() {
		System.out.println("Method1");
		method2();
		MethodChaining.sMethod1();
		sMethod2();
	}
	
	public void method2() {
		System.out.println("Method2");
		
	}
	
	public static void sMethod1() {
		System.out.println("Static Method1");
		
	}
	
	public static void sMethod2() {
		System.out.println("Static Method2");
		MethodChaining p2 = new MethodChaining();
		p2.method2();
	}

}
