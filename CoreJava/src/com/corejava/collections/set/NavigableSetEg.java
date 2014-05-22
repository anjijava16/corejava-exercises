package com.corejava.collections.set;

import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;


public class NavigableSetEg {

	public class Employee {
		private Long empID;
		public Employee(Long vempID){
			this.empID = vempID;
		}
		public Long getEmpID() {
			return empID;
		}

		public void setEmpID(Long empID) {
			this.empID = empID;
		}
		
		
		public boolean equals(Object o) {
			if (o instanceof Employee) {
				Employee emp = (Employee)o;
			    return this.empID.longValue()==emp.getEmpID().longValue();
			} else return false;
			}
	    public int hashCode() { return empID.hashCode(); }
	}
	
	public class EmployeeComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			if(o1.getEmpID().longValue()>o2.getEmpID().longValue()){
				return 1;
			}
			
			if(o1.getEmpID().longValue()<o2.getEmpID().longValue()){
				return -1;
			}
			
			return 0;
		}
		
	}
	
	public static void main(String[] args) {
		NavigableSet<Employee> nvSet = new TreeSet<Employee>(new NavigableSetEg().new EmployeeComparator());
		nvSet.add(new NavigableSetEg().new Employee(4L));
		nvSet.add(new NavigableSetEg().new Employee(4L));
		nvSet.add(new NavigableSetEg().new Employee(2L));
		nvSet.add(new NavigableSetEg().new Employee(8L));
		nvSet.add(new NavigableSetEg().new Employee(10L));
		printCollection(nvSet);
		
		System.out.println("============================================");
		//System.out.println(nvSet.pollFirst().getEmpID());//pulls the element out of Set
		//System.out.println(nvSet.pollLast().getEmpID());//pulls the element out of Set
		
		//Getting Range Views
		System.out.println("============================================");
		NavigableSet<Employee> nvSubSet = nvSet.subSet(new NavigableSetEg().new Employee(4L), 
				true, new NavigableSetEg().new Employee(10L), true);
		printCollection(nvSubSet);
		
		System.out.println("============================================");
		NavigableSet<Employee> nvHeadSet = nvSet.headSet(new NavigableSetEg().new Employee(8L), 
				true);
		printCollection(nvHeadSet);
		
		
		System.out.println("============================================");
		NavigableSet<Employee> nvTailSet = nvSet.tailSet(new NavigableSetEg().new Employee(4L), 
				true);
		printCollection(nvTailSet);
		
		/*
		
		//Getting Closest Matches
		System.out.println("============================================");
		Employee ceiling_element =  nvSet.ceiling(new NavigableSetEg().new Employee(3L));
		System.out.println(ceiling_element.getEmpID());
		
		System.out.println("============================================");
		Employee floor_element =  nvSet.floor(new NavigableSetEg().new Employee(3L));
		System.out.println(floor_element.getEmpID());
		
		
		System.out.println("============================================");
		Employee higher_element =  nvSet.higher(new NavigableSetEg().new Employee(3L));
		System.out.println(higher_element.getEmpID());
		
		
		System.out.println("============================================");
		Employee lower_element =  nvSet.lower(new NavigableSetEg().new Employee(3L));
		System.out.println(lower_element.getEmpID());
		*/
		//Navigating the Set in Reverse Order
		System.out.println("============================================");
		NavigableSet<Employee> nvSetReverse = nvSet.descendingSet();
		printCollection(nvSetReverse);
		
		
	}
	
	public static void printCollection(Collection<Employee> collct){
		for(Employee emp:collct){
			System.out.println(emp.getEmpID());
		}
	}

}
