package com.corejava.classes;

public class Test_2 {

	private Long id;
	private Test_2(){
		id=100L;
	}
	
	public Long getId() {
		return id;
	}

	public static Test_2 getTest_2Object(){
		return new Test_2();
	}

}
