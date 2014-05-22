package com.corejava.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Example_2 {
	
	//here class attribute is returned by abstract method toString;
	//while rest all the behaviour is non abstract equals,compareto,hashcode
	
	public abstract class Task implements Comparable<Task> {
		protected Task() {
		}

		public boolean equals(Object o) {
			if (o instanceof Task) {
				return toString().equals(o.toString());
			} else
				return false;
		}

		public int compareTo(Task t) {
			return toString().compareTo(t.toString());
		}

		public int hashCode() {
			return toString().hashCode();
		}

		public abstract String toString();
	}

	public final class CodingTask extends Task {
		private final String spec;

		public CodingTask(String spec) {
			this.spec = spec;
		}

		public String getSpec() {
			return spec;
		}

		public String toString() {
			return "code " + spec;
		}
	}

	public final class PhoneTask extends Task {
		private final String name;
		private final String number;

		public PhoneTask(String name, String number) {
			this.name = name;
			this.number = number;
		}

		public String getName() {
			return name;
		}

		public String getNumber() {
			return number;
		}

		public String toString() {
			return "phone " + name;
		}
	}

	public static void main(String[] args) {
		PhoneTask mikePhone = new Example_2().new PhoneTask("Mike", "987 6543");
		PhoneTask paulPhone = new Example_2().new PhoneTask("Paul", "123 4567");
		CodingTask databaseCode = new Example_2().new CodingTask("db");
		CodingTask interfaceCode = new Example_2().new CodingTask("gui");
		CodingTask logicCode = new Example_2().new CodingTask("logic");
		
		Collection<PhoneTask> phoneTasks = new ArrayList<PhoneTask>();
		Collection<CodingTask> codingTasks = new ArrayList<CodingTask>();
		Collection<Task> mondayTasks = new ArrayList<Task>();
		Collection<Task> tuesdayTasks = new ArrayList<Task>();
		
		Collections.addAll(phoneTasks, mikePhone, paulPhone);
		Collections.addAll(codingTasks, databaseCode, interfaceCode, logicCode);
		Collections.addAll(mondayTasks, logicCode, mikePhone);
		Collections.addAll(tuesdayTasks, databaseCode, interfaceCode, paulPhone);
		
		//Adding Elements
		phoneTasks.add(new Example_2().new PhoneTask("Mike_1", "9873 6543"));
		Collection<Task> allTasks = new ArrayList<Task>();
		allTasks.addAll(mondayTasks);
		allTasks.addAll(tuesdayTasks);
		
		
		//removing elements
		boolean wasPresent = mondayTasks.remove(mikePhone);
		System.out.println(wasPresent);
		mondayTasks.clear();
		System.out.println(mondayTasks.isEmpty());
		
		
		Collection<Task> tuesdayNonphoneTasks = new ArrayList<Task>(tuesdayTasks);
		tuesdayNonphoneTasks.removeAll(phoneTasks);
		System.out.println(tuesdayNonphoneTasks.size());
		
		Collection<Task> phoneTuesdayTasks = new ArrayList<Task>(tuesdayTasks);
		phoneTuesdayTasks.retainAll(phoneTasks);
		System.out.println(phoneTuesdayTasks);
		
		//Querying the Contents of a Collection
		Collection<Task> tuesdayPhoneTasks = new ArrayList<Task>(tuesdayTasks);
		System.out.println(tuesdayPhoneTasks.contains(paulPhone));
		System.out.println(tuesdayTasks.containsAll(tuesdayPhoneTasks));
		System.out.println(mondayTasks.isEmpty());
		System.out.println(mondayTasks.size());
		
		//Making the Collection Contents Available for Further Processing The methods
		//in this group provide an iterator over the collection or convert it to an array.
		// throws ConcurrentModificationException
		for (Task t : tuesdayTasks) {
		if (t instanceof PhoneTask) {
		tuesdayTasks.remove(t);
		}
		}
		

	}

}
