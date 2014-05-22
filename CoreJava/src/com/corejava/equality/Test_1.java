package com.corejava.equality;

import java.math.BigDecimal;

public class Test_1 {

	/*
	 * printing hashcodes for datatypes
	 * 
	 * 
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		//Integer,Long,String,Float,int,long
		
		Integer v1 = 1;
		Integer v2 = 1;
		
		Long v3= 3L;
		Long v4= 3L;
		
		String v5 = "test";
		String v6 = "test";
		
		Float v7 = new Float(4.6);
		Float v8 = new Float(4.6);
		
		BigDecimal v9 = new BigDecimal(4.6);
		BigDecimal v10 = new BigDecimal(4.6);
		
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		System.out.println(v3.hashCode());
		System.out.println(v4.hashCode());
		System.out.println(v5.hashCode());
		System.out.println(v6.hashCode());
		System.out.println(v7.hashCode());
		System.out.println(v8.hashCode());
		System.out.println(v9.hashCode());
		System.out.println(v10.hashCode());
		
		
		
		
		
		
		
		
		
		
		//If two Strings are same,their test.hashCode() returns same value 
	}

}
