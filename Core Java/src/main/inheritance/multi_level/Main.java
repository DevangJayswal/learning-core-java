package main.inheritance.multi_level;

public class Main extends C implements A, B {
	
	int a=1;
	
	public void hello() {
		System.out.println("Main.hello");
	}
	
	public static void main(String[] args) {
		
		
		A a = new Main();
		B b = new Main();
		C c = new Main();
		C cm = new Main();
		
		
		b.hello();
		System.out.println("A.a=" + a.a);
		System.out.println("B.a=" + b.a);
		System.out.println("C.a=" + c.a);
		cm.hello();
		System.out.println("CM.a=" + cm.a);		
	}
}
