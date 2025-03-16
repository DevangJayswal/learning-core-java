package com.example.core.java.src.main;

class ABC {
	public void show() {
		System.out.println("ABC show()");
	}
}

class XYZ {
	public void show() {
		System.out.println("XYZ show()");
	}

}

class PQR {
	
	int a=10;
	public void show() {
		System.out.println("XYZ show()");
	}
}

public class Test {

	public static void main(String[] args) {
		ABC a;
		XYZ x;
		
		PQR p = new PQR();
		PQR p1;
		PQR p2;
		
		System.out.println("p.a="+p.a);
		p1=p;
		p2=p;
		p1.a=11;
		System.out.println("p.a="+p.a);
		p2.a=13;
		System.out.println("p.a="+p2.a);
		
		

	}

}
