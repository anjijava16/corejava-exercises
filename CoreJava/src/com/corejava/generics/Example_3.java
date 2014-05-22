package com.corejava.generics;

import java.util.ArrayList;
import java.util.List;

public class Example_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Wildcards with extends
		//Integer extends Number
		//Long extends Number
		
		//1:
		List<Number> n_lst_1 = new ArrayList<Number>();
		
		List<Integer> i_lst_1 = new ArrayList<Integer>();
		
		//n_lst_1 = i_lst_1;
		//doesn't work,cant assign Integer list to number list,
		//because type is fixed by generic definition.
		//To make this work,we need to use wildcards :example 2
		
		//2:
		List<? extends Number> n_lst_2 = null;
		List<Integer> i_lst_2 = new ArrayList<Integer>();
		n_lst_2 = i_lst_2;
		//this works because LHS type <? extends Number> matches with RHS type <Integer>
		
		//3:Collection with <? extends T>,is always used to read data from
		List<? extends Number> n_lst_3 = new ArrayList<Integer>();
		n_lst_3.add(null);
		//you cannot add any datatype to n_lst_3,other than null
		
		List<Integer> i_lst_4 = new ArrayList<Integer>();
		i_lst_4.add(1);
		i_lst_4.add(2);
		i_lst_4.add(3);
		List<? extends Number> n_lst_4 =  i_lst_4;
		System.out.println(n_lst_4);
		
		//1:one cannot add anything to n_lst_4 other than null
		//,but one can assign a particualr structure to it.
		n_lst_4.add(null);
		//n_lst_4.add(3);gives error
		
		

	}

}
