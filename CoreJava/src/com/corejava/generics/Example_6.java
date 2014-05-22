package com.corejava.generics;

import java.util.ArrayList;
import java.util.List;


public class Example_6 {

	public static <T> void reverse(List<T> list) {
		List<T> tmp = new ArrayList<T>(list);
		for (int i = 0; i < list.size(); i++) {
		list.set(i, tmp.get(list.size()-i-1));
		}
		}
	
//	public static void reverse_1(List<?> list) {
//		List<Object> tmp = new ArrayList<Object>(list);
//		for (int i = 0; i < list.size(); i++) {
//		list.set(i, tmp.get(list.size()-i-1)); // compile-time error
//		}
//		}
	
	public static void reverse_3(List<?> list) { rev(list); }
	private static <T> void rev(List<T> list) {
	List<T> tmp = new ArrayList<T>(list);
	for (int i = 0; i < list.size(); i++) {
	list.set(i, tmp.get(list.size()-i-1));
	}
	}
	//above T working as placeholder for wildcard ?.This is wild card capture.
	//as List<T> tmp works,but List<Object> tmp holding List<?> list doesn't work at run time
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
