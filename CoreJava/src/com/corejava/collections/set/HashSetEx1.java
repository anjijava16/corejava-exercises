package com.corejava.collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Integer> intSet = new HashSet<Integer>();
		
		intSet.add(1);
		intSet.add(2);
		intSet.add(3);
		
		System.out.println(intSet);
		
		
		Set<String> strSet = new HashSet<String>();
		strSet.add("adem");
		strSet.add("3213bedar");
		strSet.add("ce323dar");
		System.out.println(strSet);
		
		

	}

}
