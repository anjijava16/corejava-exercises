package com.corejava.abstarct;

public class Example_4 {

	
	public abstract class Animal{
		public void methodWithBody(){
			System.out.println("I am Animal method with body");
		}
	}
	
	public class Cat extends Animal{
		
	}
	
	public class Dog extends Animal{
		public void methodWithBody(){
			System.out.println("I am DOG method with body");
		}
	}
	
	
	
	public static void main(String[] args) {
		
		Example_4 example = new Example_4();
		
		Animal cat = example.new Cat();
		/*As Cat() did not override methodWithBody()
		 * cat.methodWithBody() calls to abstract 
		 * class's Animal's method with body
		 */
		
		Animal dog = example.new Dog();
		/*As Dog() override methodWithBody()
		 * dog.methodWithBody() calls to  
		 * Dog()'s methodWithBody() implementation 
		 */
		
		cat.methodWithBody();
		dog.methodWithBody();

	}



	

}
