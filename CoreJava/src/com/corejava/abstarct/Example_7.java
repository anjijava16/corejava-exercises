package com.corejava.abstarct;


public class Example_7 {

	public abstract class A{
		public abstract void sayA();
	}
	
	public abstract class B extends A{
		
	}
	
	public class C extends B{

		@Override
		public void sayA() {
			System.out.println("Ths is A in Class C");
			
		}
		
	}


	public static void main(String[] args) {
		A c_obj = new Example_7().new C();
		c_obj.sayA();

	}

}
