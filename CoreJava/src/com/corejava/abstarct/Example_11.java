package com.corejava.abstarct;

public class Example_11 {

	public interface IntrFace_1{
		public void printIntr_1();
	}
	
	public class TestImpl implements IntrFace_1 {

		
		public void printIntr_1() {
			System.out.println("1");
			
		}
		
		
		public void printIntr_2() {
			System.out.println("2");
			
		}
		
	}
	
	
	public static void main(String[] args) {
		IntrFace_1 fc = new Example_11().new TestImpl();
		fc.printIntr_1();
		//cant access printIntr_2 using fc

	}

}
