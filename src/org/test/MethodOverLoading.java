package org.test;

public class MethodOverLoading {
	
	public void mobileCalling(String name) {
	System.out.println("Mobile Contact   :"+ name);
	}
	public void mobileCaling(long number) {
		System.out.println("Mobile number"+ number);

	}
	
	
	public static void main(String[] args) {
		
		MethodOverLoading m = new MethodOverLoading();
		m.mobileCalling("sakthi");
		m.mobileCaling(9994445204l);
		
		
		
	}

}
