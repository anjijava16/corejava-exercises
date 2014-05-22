package com.corejava.serialization;

import java.io.IOException;

public class SerializationUidTest {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//1]set serialVersionUID = 1L for Person and run below step.
//		Person nonSerializedPerson = new Person("doke",1L);
//		Person.setPersonCountry("india");
//		SerialUtil.serialize("test.out", nonSerializedPerson);
//		Person deSerializedPerson = (Person) SerialUtil.deSerialize("test.out");
//		System.out.println(deSerializedPerson.toString());
		
		//2]set serialVersionUID = 2L for Person and comment step 1 and run below step.
		/*
		 * Exception in thread "main" java.io.InvalidClassException: com.corejava.serialization.Person; 
		 * local class incompatible: stream classdesc serialVersionUID = 1, local class serialVersionUID = 2
		   at java.io.ObjectStreamClass.initNonProxy(ObjectStreamClass.java:617)

		 * 
		 * 
		 * */
		
		
		Person deSerializedPerson = (Person) SerialUtil.deSerialize("test.out");
		System.out.println(deSerializedPerson.toString());
		
		

	}

}
