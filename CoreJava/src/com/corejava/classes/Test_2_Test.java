package com.corejava.classes;

public class Test_2_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//1]Test_2 test = new Test_2();
		
		//2]
		
		Test_2 test = Test_2.getTest_2Object();
		System.out.println(test.getId());

	}

}

//1]If constructor of a class is private then while creating object of that class we get
//constructor not visible error.

//2]getTest_2Object(),is a public static method which creates Test_2
//object and returns.This way no class can change Test_2 objects contents.
//Test_2 becomes immutable