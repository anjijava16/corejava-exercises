package com.corejava.generics;

import java.util.ArrayList;
import java.util.List;

public class Example_2 {

	
	public static void main(String[] args) {
		List<Number> nums = new ArrayList<Number>();
		//this works because ArrayList is subtype of List:substitution rule 1:"="
		Integer a = 2;//Integer is subtype of Number
		Long b = 3l;//Long is subtype of Number
		nums.add(a);//works because,Integer is subtype of Number 
		nums.add(b);//works because,Long is subtype of Number
		System.out.println(nums.toString());
		
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(1);
		ints.add(2);
		//List<Number> nums_2 = ints;
		//gives error as List<Integer> is not subtype of List<Number>
		//Type mismatch: cannot convert from List<Integer> to List<Number>
		

	}

}
