package com.test.innerclasses;


/*
 *  Nested classes are divided into two categories: static and non-static. 
 *  Nested classes that are declared static are simply called static nested classes. 
 *  Non-static nested classes are called inner classes.
 * 
 * 
 * 
 * */


public class Test_1 {
	private int b;
	private static int c=0;
	
	public Test_1(int bval){
		b = bval;
	}
	
	public int getB() {
		return b;
	}



	public void setB(int b) {
		this.b = b;
	}



	public static int getC() {
		return c;
	}



	
	
	public static class NestedStatic{//nested static class//can access only static members of enclosing class
		private int a;
		public NestedStatic(int aval){
			a = aval;
		}
		public int getA() {
			return a;
		}
		public int incrmntC(){
			c++;
			return c;
		}
		
	}

	public class Inner{//inner class i.e non static Nested class//can access all members(static and nonstatic) of enclosing class
		private int a;
		public Inner(int aval){
			a = aval;
		}
		public int getA() {
			return a;
		}
		public int incrB() {
			b++;
			return b;
		}
		
		public int incrmntC(){
			c++;
			return c;
		}
	}
	
	
	
	public static void main(String[] args) {
		NestedStatic ns = new Test_1.NestedStatic(1);
		ns.incrmntC();
		System.out.println(Test_1.getC());
		
		
		Test_1 ts = new Test_1(10);
		Inner ins = ts.new Inner(2);
		System.out.println(ins.incrB());
		System.out.println(ins.incrmntC());
		
		
		
		
		
		

		
		
	}
}
