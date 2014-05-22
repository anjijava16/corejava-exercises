package com.corejava.serialization;

import java.io.IOException;


public class SerializationTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
      
		Person nonSerializedPerson = new Person("doke",1L);
		Person.setPersonCountry("india");
		SerialUtil.serialize("personFile.out", nonSerializedPerson);
		
		
		Person deSerializedPerson = (Person) SerialUtil.deSerialize("personFile.out");
		
		System.out.println(deSerializedPerson.toString());
		
		
		
	}



}
