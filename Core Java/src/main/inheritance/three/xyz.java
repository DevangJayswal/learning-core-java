package main.inheritance.three;

class xyz extends abc {
	void s() {
		System.out.println("xyz.s() called");
		super.s();

	}

	public static void main(String[] s) {
		xyz x = new xyz();
		x.s();

	}

}