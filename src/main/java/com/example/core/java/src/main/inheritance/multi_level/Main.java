package com.example.core.java.src.main.inheritance.multi_level;

public class Main extends C implements A, B {

	int a = 1;

	public void hello() {
		System.out.println("Main.hello");
	}

	public static void main(String[] args) {

		A a = new Main();
		B b = new Main();		
		C cm = new Main();
		C c = new C();

		System.out.println("A.a=" + a.a);//2 
		a.hello();//Main.hello
		System.out.println("B.a=" + b.a);//3
		b.hello();//Main.hello
		System.out.println("CM.a=" + cm.a);//4
		cm.hello();//Main.hello
		System.out.println("C.a=" + c.a);//4
		c.hello();//C.hello
	}
}
