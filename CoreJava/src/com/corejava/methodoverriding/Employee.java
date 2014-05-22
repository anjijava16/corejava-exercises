package com.corejava.methodoverriding;

public class Employee {

	public void greet(String name){
		System.out.println("Hello "+name);
	}
	
	public Number getAge(Integer age){
		Number num = age;
		return num;
	}
	
	public Number getMoney(Number mon){
		return mon;
	}
	
	public final Integer getExperience(Integer exp){
		return exp;
	}
}
