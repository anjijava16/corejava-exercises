package com.corejava.methodoverriding;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee emp = new SecurityGuard();
		//this is overriding according to rule 1
		//emp.greet("doke");
		
		//this is overriding according to rule 2
		//System.out.println(emp.getAge(55));
		
		//this is overriding wont work; according to rule 3
		//System.out.println(emp.getMoney(5));
		
		
		

	}

}
