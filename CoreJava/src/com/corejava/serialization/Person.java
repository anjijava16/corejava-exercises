package com.corejava.serialization;

import java.io.Serializable;

public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;// pas value 1L
	private String name;
	private static String personCountry;
	private transient Long fileid;

	public Person(String name, Long fileid) {
		super();
		this.name = name;
		this.fileid = fileid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		
		return "name(non-static): "+this.name+"\n fileid(transient): "+this.fileid+
		"\n country(static): "+personCountry;
	}

	public static String getPersonCountry() {
		return personCountry;
	}

	public static void setPersonCountry(String personCountry) {
		Person.personCountry = personCountry;
	}

	public Long getFileid() {
		return fileid;
	}

	public void setFileid(Long fileid) {
		this.fileid = fileid;
	}

}
