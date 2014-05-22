package com.corejava.abstarct;


public class Example_8 {

	public abstract class A implements TestInterface{
		
	}
	
	
	public abstract class B implements TestInterface{
		public void sayHello(){
			System.out.println("Hi I am Hello in B");
		}
	}
	
	public abstract class C implements TestInterface{
		public abstract void sayHello();
	}
	
	public class ChildA extends A{

		@Override
		public void sayHello() {
			System.out.println("Hi I am Hello in ChildA");
			
		}
		
	}
	
	public class ChildB extends B{
		
	}
	
	public class ChildC extends C{

		@Override
		public void sayHello() {
			System.out.println("Hi I am Hello in ChildC");
			
		}
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
