package org.test;

public class ReturnPractice {
	static String s = "Raja";
	int r = 100;
	public void add(int a, int b) {
		int c=a+b;

		System.out.println(c);
		
	}

	public boolean name(String name) {
		System.out.println(name);
		System.out.println(s);
		return true;
	}
	public void sum() {
		int d =500;
		System.out.println(r);

	}

	public String wash() {
		return "washed";
	}

	public static void main(String[] args) {
		
		

		ReturnPractice r = new ReturnPractice();
 r.add(100, 200);
 
		boolean name = r.name("sakthi");
		System.out.println(name);
		System.out.println(r.wash());
	}
}
