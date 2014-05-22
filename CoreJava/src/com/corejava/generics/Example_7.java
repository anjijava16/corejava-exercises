package com.corejava.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example_7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		1]Wildcards may not appear at the top level(nested will work) in class instance creation expressions (new),
		2]in explicit type parameters in generic method calls, 
		3]or in supertypes (extends and
		implements).
		*/
		
		//1]
		//List<?> list = new ArrayList<?>(); // compile-time error
		//Map<String, ? extends Number> map
		//= new HashMap<String, ? extends Number>(); // compile-time error
		
		
		//this will work
		List<List<?>> lists = new ArrayList<List<?>>();
		lists.add(Arrays.asList(1,2,3));
		lists.add(Arrays.asList("four","five"));
		//2]
		/*
		One way to remember the restriction is that the relationship between wildcards and
		ordinary types is similar to the relationship between interfaces and classes—wildcards
		and interfaces are more general, ordinary types and classes are more specific, and instance
		creation requires the more specific information. Consider the following three
		statements:
		*/
		List<?> list = new ArrayList<Object>(); // ok
		//List<?> list_2 = new List<Object>(); // compile-time error
		//List<?> list_3 = new ArrayList<?>(); // compile-time error
		/*
		The first is legal; 
		
		****vvimp:=>the second is illegal because an instance creation expression requires
		a class, not an interface; 
		
		and the third is illegal because an instance creation expression
		requires an ordinary type, not a wildcard.
		*/
		
		
		
		
		
		

	}

}
