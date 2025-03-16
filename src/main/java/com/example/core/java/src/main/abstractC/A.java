package com.example.core.java.src.main.abstractC;

public abstract class A {
	int a = 1;

	void hello() {
		System.out.println("A.hello()");
	}
}

abstract class B {
	int a = 2;

	void hello() {
		System.out.println("B.hello()");
	}
}

class C {
	int a = 3;

	void hello() {
		System.out.println("C.hello()");
	}

}

interface D {
	int a = 5;

	void hello();
}

class Main extends A implements D {
	int a = 6;

	public void hello() {
		System.out.println("Main.hello()");
	}

	public static void main(String[] args) {
		A a = new Main();
		D d = new Main();

		System.out.println("A.a=" + a.a);//1
		a.hello();// Main.hello
		System.out.println("D.a=" + D.a);//5
		d.hello();//Main.hello
	}
}
