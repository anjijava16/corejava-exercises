package com.corejava.interfaces;

public class Example_10 {

	public interface IntrFace_1{
		int a=8;
		public void printIntr_1();
	}
	
	public interface IntrFace_2 extends IntrFace_1{
		public void printIntr_2();
		
	}
	
	
	public interface IntrFace_3 extends IntrFace_1,IntrFace_2{
		public void printIntr_3();
	}
	
	
	public class Child_123 implements IntrFace_3{

		@Override
		public void printIntr_3() {
			System.out.println(3);
			
		}

		@Override
		public void printIntr_1() {
			System.out.println(1);
			
		}

		@Override
		public void printIntr_2() {
			System.out.println(2);
			
		}
		
	}
	
	public static void main(String[] args) {
		IntrFace_3 chld = new Example_10().new Child_123();
		chld.printIntr_1();
		chld.printIntr_2();
		chld.printIntr_3();
		
		System.out.println(IntrFace_3.a);
		
		
		

	}

}
