package com.corejava.generics;

import java.util.ArrayList;
import java.util.List;

public class Example_1 {

	public static void main(String[] args) {
		
		List<String> nameList = new ArrayList<String>();
		nameList.add("name_1");
		nameList.add("name_2");
		nameList.add("name_3");
		
		//try adding Long to nameList,it wont work
		//nameList.add(23L);
		
		for(String name:nameList){
			System.out.println(name);
		}



	}

}
