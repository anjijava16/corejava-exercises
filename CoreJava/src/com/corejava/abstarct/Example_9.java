package com.corejava.abstarct;

public class Example_9 {

	public interface NoMethodInterface{
		
	}
	
	
	public class Child implements NoMethodInterface{
		public void showChild(){
			System.out.println("i am a child");
		}
	}
	
	public static void main(String[] args) {
		NoMethodInterface child = new Example_9().new Child();
		//child.
		//cant find child.showChild()

	}

}
