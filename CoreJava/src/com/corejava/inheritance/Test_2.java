package com.corejava.inheritance;
/*
 * 
 * 
 * //method overloading
 * //method overriding
 * //in inheritance 
 * 
 * 
 * 
 * 
 * 
 * */
public class Test_2 {

	public class Animal{
		private Long id;
		public Animal(Long idval){
			id = idval;
		}
		public Long getId() {
			return id;
		}
		public void printID(String test){
			System.out.println(test+"===>"+id);
		}
		
	}
	
	public class Dog extends Animal{

		public Dog(Long idval) {
			super(idval);
		}
		
		public void printID(String test,String test2){//method overloading
			System.out.println(test+"==="+test2+"===>"+this.getId());
		}
		
		public void printID(String test){//method overriding
			System.out.println(test+" child class ===>"+this.getId());
		}
		
		
		
	}
	
	public static void main(String[] args) {
		Dog dg = new Test_2().new Dog(3L);
		dg.printID("hi");//method overriding
		dg.printID("hi","hello");//method overloading
		
		

	}

}
