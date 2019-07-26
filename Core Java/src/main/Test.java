package main;

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setsName("devang");
		Course c1 = new Course();
		c1.setcName("Java");
		Result r1 = new Result();
		r1.setM1(95);
		r1.setM2(80);
		
		c1.setResult(r1);
		s1.setCourse(c1);
		
		

	}

}
