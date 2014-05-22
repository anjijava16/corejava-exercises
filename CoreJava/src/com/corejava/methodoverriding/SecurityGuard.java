package com.corejava.methodoverriding;

public class SecurityGuard extends Employee {

	//this is not overriding,according to rule 1
	public void greet(String name,Integer times){
		for(int i=0;i<times;i++){
		System.out.println("Hello "+name);
		}
	}
	
	//this is overriding according to rule 1
	public void greet(String name){
		System.out.println("I have overridden Hello "+name);
		
	}
	
	//this is overriding according to rule 2
	public Integer getAge(Integer age){
		System.out.println("I have overridden getAge()");
		return age;
	}
	
	//this is overriding wont work; according to rule 3
	public Integer getMoney(Integer mon){
		System.out.println("I have overridden getMoney()");
		return mon.intValue();
	}
	
	//this is overriding wont work; according to rule 4
//	public Integer getExperience(Integer exp){
//		System.out.println("I have overridden getExperience()");
//		return exp;
//	}
	
	
	
	
}
