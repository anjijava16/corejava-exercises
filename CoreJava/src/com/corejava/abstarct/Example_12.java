package com.corejava.abstarct;


public class Example_12 {

	public abstract class AB1{
		private int id;
		public AB1() {
			id=0;
			System.out.println("ab1 constructor"); 
		}
	}
	
	public class AB1Child1 extends AB1{
		private int loc;
	}
	
	public class AB1Child2 extends AB1{
		private int loc;
		public AB1Child2(){
			loc=10;
			System.out.println("AB1Child2 constructor"); 
		}
	}
	
	public class AB1Child3 extends AB1{
		private int loc;
		public AB1Child3(){
			//super();use super() only when u need to pass something to parent constructor
			loc=10;
			System.out.println("AB1Child3 constructor"); 
		}
	}
	
	public static void main(String[] args) {
		//AB1 AB = new Example_12().new AB1(); cannot create instance of new Example_12().new AB1()
		
		AB1 ab1 = new Example_12().new AB1Child1();
		System.out.println("/********************************/");
		AB1 ab2 = new Example_12().new AB1Child2();
		System.out.println("/********************************/");
		AB1 ab3 = new Example_12().new AB1Child3();
		
		

	}

}
