package com.corejava.abstarct;

public class Example_5 {

	
	public abstract class Animal{
		public abstract void methodWithoutBody();
	}
	
	
	public class Dog extends Animal{

		@Override
		public void methodWithoutBody() {
			System.out.println("This is DOG's methodWithoutBody()");
			
		}
		
	}
	
	public static void main(String[] args) {
		Animal dog = new Example_5().new Dog();
		dog.methodWithoutBody();

	}

}
