package com.corejava.inheritance;

public class Test_1 {

	/*To learn constructor behavior in inheritance and user of super key word
	 * 
	 * Mark class Animal as abstract or concrete all behaviour still remains the same 
	 * 
	 * */
	
	public abstract class Animal{
		private String anType;
		public Animal(){
			super();
			anType = "test";
			System.out.println("default constructor:Animal");
		}
		public Animal(String type){
			anType = type;
			System.out.println("param cunstroctor:Animal");
		}
		public String getAnType() {
			return anType;
		}
		
	}
	
	public class Dog extends Animal{
		
	}
	
	public class Cat extends Animal{//subclass constructor not calling parent classes constructor
		private String catName;
		public Cat(){
			catName = "ct";
			//super.getAnType();//to call super class method in base class
			System.out.println("default constructor:Cat");
		}
		public Cat(String canName){
			catName = canName;
			System.out.println("param constructor:Cat");
		}
		public String getCatName() {
			//super.getAnType();//to call super class method in sub class
			return catName;
		}
	}
	
	public class Horse extends Animal{//subclass constructor  calling parent classes constructor
		private String horseName;
		public Horse(){
			super("Horse");//constructor call must be first statement in constructor
			horseName = "hrs";
			System.out.println("default constructor:Horse");
		}
		public Horse(String hrsnm){
			super(hrsnm);//constructor call must be first statement in constructor
			horseName = hrsnm;
			System.out.println("param constructor:Horse");
		}
		public String getHorseName() {
			return horseName;
		}
	}
	
	
	
	
	public static void main(String[] args) {
		//1]
		//Dog dg = new Test_1().new Dog();//base has no constructor,it calls default constructor of parent
		//2]
		//Dog dg = new Test_1().new Dog("dino");//gives error,constructor undefined
		//3]
		//calls default constructor of animal first and then default constructor of CAT 
		//Cat ct = new Test_1().new Cat();
		//System.out.println(ct.getAnType());
		//System.out.println(ct.getCatName());
		//4]
		//calls default constructor of animal and param constructor of cat
		//Cat ct = new Test_1().new Cat("molly");
		//System.out.println(ct.getAnType());
		//System.out.println(ct.getCatName());
		//5]
		//Horse hrs = new Test_1().new Horse();
		//System.out.println(hrs.getAnType());
		//System.out.println(hrs.getHorseName());
		//6]
		//Horse hrs = new Test_1().new Horse("blue");
		//System.out.println(hrs.getAnType());
		//System.out.println(hrs.getHorseName());
		//1]when base class is instatiated first its parents constructor is called and then base's classes.
		//2]if parent constructor call need to be in subclass constructor then it must be first statement in constructor
		//3]if in the first statement in sub class constructor,there is no call to super class constructor,then default super class constructor is called.4],3],1]
		//4]to call super class method in sub class use //super.getAnType(); u can use it in sub constructor or method
		//5]Mark animal class abstract and still everything works same manner

	}

}
