package com.corejava.interfaces;

public class Example_12 {

	public abstract class Abstrct_1{
		public abstract void print();
	}
	
	public class Concrete_1{
		public void print(){
			System.out.println("I am printing!!");
		}
	}
	
	public class Concrete_2{
		public void print_2(){
			System.out.println("I am printing 2!!");
		}
	}
	
	
	//public interface Ia extends Concrete_1{
		
	//};
	//The type Example_12.Concrete_1 cannot be a superinterface of Ia; 
	//a superinterface must be an interface
	
	//public interface Ia extends Abstrct_1{
		
	//}
	//The type Example_12.Abstrct_1 cannot be a superinterface of Ia; 
	//a superinterface must be an interface
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
