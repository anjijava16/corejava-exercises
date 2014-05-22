package com.corejava.collections.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetEg {

	public class Employee implements Comparable<Employee>{
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
			@Override
			public int compareTo(Employee o) {
				if(this.empID>o.empID){
					return 1;
				}else if(this.empID<o.empID){
					return -1;
				}
				
				return 0;
			}
		
	}
	

	public static void main(String[] args) {
		
		SortedSet<Employee> sn  = new TreeSet<Employee>();
		//you can also give comparator 
		//to Treeset constructor new TreeSet<Employee>(Comparator<Employee> empcomparator);
		sn.add(new SortedSetEg().new Employee(4L));
		sn.add(new SortedSetEg().new Employee(4L));
		sn.add(new SortedSetEg().new Employee(2L));
		sn.add(new SortedSetEg().new Employee(8L));
		sn.add(new SortedSetEg().new Employee(10L));
		for(Employee emp:sn){
			System.out.println(emp.getEmpID());
		}
		System.out.println("SortedSet methods start");
		//1:Getting the First and Last Elements,Methods of SortedSet Interface
		System.out.println(sn.first().getEmpID());
		System.out.println(sn.last().getEmpID());
		
		//2:Getting Range Views
		System.out.println("RANGE===================");
		/*
		subSet returns a set containing every element of the original set that is
		greater than or equal to fromElement and less than toElement.
		*/
		SortedSet<Employee> sn_sub = sn.subSet(new SortedSetEg().new Employee(4L), new SortedSetEg().new Employee(10L));
		for(Employee emp:sn_sub){
			System.out.println(emp.getEmpID());
		}
		
		/*
		 * headset returns every element that is less than toElement
		 * 
		 * */
		System.out.println("headset===================");
		SortedSet<Employee> sn_headSet = sn.headSet(new SortedSetEg().new Employee(4L));
		for(Employee emp:sn_headSet){
			System.out.println(emp.getEmpID());
		}
		
		/*
		 * tailSet returns every
		 *	element that is greater than or equal to fromElement.
		 */
		System.out.println("sn_tailSet===================");
		SortedSet<Employee> sn_tailSet = sn.tailSet(new SortedSetEg().new Employee(4L));
		for(Employee emp:sn_tailSet){
			System.out.println(emp.getEmpID());
		}
		System.out.println("SortedSet methods end");
		
		System.out.println("==========================================================================");
		System.out.println("Navigable set start");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Navigable set end");
		
		
	}

}
