package com.corejava.generics;

import java.util.ArrayList;
import java.util.List;

public class Example_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//List<? super T> supeList = null;
		//gives error,you can write generic type always in the context of class,method,constructor
		//not with assignment operator.
		
		List<? super Integer> superList_1 = null;
		
		//1:create list of Number and try to assign
		
		List<Number> numlist_1 = new ArrayList<Number>();
		numlist_1.add(1);
		numlist_1.add(2);
		numlist_1.add(3);
		superList_1 = numlist_1;
		
		//List of supertype Number numlist_1 got assigned to superList_1
		
		//2:adding supertype
		List<? super Integer> superList_2 = new ArrayList<Integer>();
		superList_2.add(5);
		Number num = 8;
		superList_2.add((Integer) num);
		//One can add super elements to structure of type <? super T>
		
		//one cannot read anything from superList_2 below gives error
		//for(Integer intg:superList_2){
			
		//}
		
		/*List<? super T> is always used to write data not to read
		 *
		 *         Write	   Read
		 * Object<---------T<-----------null
		 * */
		
		/*
		 * '=':on RHS we always need concrete type for a generic
		 * 
		 * method:when a method is called 
		 * it should be called with concrete type of the involved generics
		 * 
		 * 
		 * 
		 * */
		
		
		

	}

}
