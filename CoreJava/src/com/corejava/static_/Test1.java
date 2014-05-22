package com.corejava.static_;


public class Test1 {
	
	public static int a;
	public int b;
	static{
		System.out.println("hellow!i am static block");
		a =10;
	}
	
	{
	System.out.println("block with no name");	
	}
	public Test1(){
		System.out.println("hellow!i am a constructor");
		
	}
	
	public static void printA(){
		System.out.println(a);
	}

	
	public static void main(String[] args) {
		Test1 tst = new Test1();
		Test1.printA();
	}

}

//A class can have any number of static initialization blocks, and they can appear anywhere in the class body. 
//The runtime system guarantees that static initialization blocks are called in the order that they 
//appear in the source code. And dont forget, this code will be executed when JVM loads the class. 
//JVM combines all these blocks into one single static block and then executes

//1]Non static method can access both static and non static class members and methods.
//2]static method/block can access only static class members and methods



//Again if you miss to precede the block with "static" keyword, the block is called "constructor block" 
//and will be executed when the class is instantiated. The constructor block will be copied into 
//each constructor of the class. Say for example you have four parameterized constructors, 
//then four copies of contructor blocks will be placed inside the constructor, one for each. 
//Lets execute the below example and see the output.

/*
 * So what are the advantages of static blocks?
If you’re loading drivers and other items into the namespace. For ex, Class class has a static block where it registers the natives.
If you need to do computation in order to initialize your static variables,you can declare a static block which gets executed exactly once,when the class is first loaded.
Security related issues or logging related tasks
Ofcourse there are limitations for static blocks 
There is a limitation of JVM that a static initializer block should not exceed 64K.
You cannot throw Checked Exceptions.
You cannot use this keyword since there is no instance.
You shouldn’t try to access super since there is no such a thing for static blocks.
You should not return anything from this block.
Static blocks make testing a nightmare.
 * 
 * 
 * */
