package com.example.core.java.src.main.inheritance;

public class abc extends pqr {

	int a;

	void s3() {
		System.out.println("abc called");
	}

	public static void main(String[] d) {

//		xyz x = new xyz();
//		x.a = 100;
//		x.s();

		/*
		 * pqr p = new pqr(); p.a = 50; p.s(); //0 p.s1();//50
		 */

		xyz x = new pqr();
		x.s();
//		x.s1();

		// pqr p1 = new xyz();
		// p1.s();
		// pq.s1();

	}
}
