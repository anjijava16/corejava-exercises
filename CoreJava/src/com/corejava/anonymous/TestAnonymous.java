package com.corejava.anonymous;

public class TestAnonymous {

	public static void main(String[] args) {
		IPrint print = new IPrint(){

			@Override
			public void print(String str) {
				System.out.println("Hellow "+str);
				
			}
			
		};
		
		
		print.print("rahul");

	}

}
