package com.corejava.abstarct;


public class Example_6 {
	
	public abstract class A {
		
		public void sayA(){
			System.out.println("I am A");
		}
	}
	
	public abstract class B extends A{
		public void sayB(){
			System.out.println("I am B");
		}
	}
	
	public class C extends B {
		
	}
	
	public class D extends B {
		public void sayA(){
			System.out.println("I am A in D");
		}
		public void sayB(){
			System.out.println("I am B in D");
		}
		
	}
	
	public static void main(String[] args) {
		B c_obj = new Example_6().new C();
		c_obj.sayA();
		c_obj.sayB();
		//C does not overrides B methods
		
		
		B d_obj = new Example_6().new D();
		d_obj.sayA();
		d_obj.sayB();
		//D does overrides both methods of B

	}

}
