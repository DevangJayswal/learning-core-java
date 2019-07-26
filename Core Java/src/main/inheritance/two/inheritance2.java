package main.inheritance.two;

public class inheritance2 extends inheritance1 {
	int a = 1;

	void i1() {
		System.out.println("i2.i1 called");
	}

	public static void main(String[] args) {
		inheritance2 i2 = new inheritance2();
		inheritance1 i1 = new inheritance2();

		System.out.println("i2.a=" + i2.a);
		System.out.println("i1.a=" + i1.a);
		i2.i1();
		i1.i1();
	}
}


//OUTPUT
//i2.a=1
//i1.a=10
//i2.i1 called
//i2.i1 called