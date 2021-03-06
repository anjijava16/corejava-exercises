package com.corejava.cloning;

public class ShallowCloning {
	
	private class Address{
		private String street;
		private String zip;
		
		public Address(String street,String zip){
			this.street=street;
			this.zip=zip;
		}

		public String getStreet() {
			return street;
		}

		public String getZip() {
			return zip;
		}
		
	}

	private class Employee implements Cloneable{
		private int empno;
		private String empname;
		private Address address;
		
		public Employee(String empname,int empno,Address address){
			this.empno= empno;
			this.empname= empname;
			this.address = address;
		}

		@Override
		public String toString() {
			String str = "Employee Object Info(hashcode:empname:empno) "+this.hashCode()+"----"+this.empname+"------"+this.empno+"\n";
			str += "Address object info (hashcode:street:zip)"+this.address.hashCode()+"-------"+this.address.getStreet()+"------"+this.address.getZip();
			return str;
		}
		@Override
		protected Object clone() throws CloneNotSupportedException {
			//super.clone() returns cloned object
			return super.clone();
		}
		
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp1 = new ShallowCloning().new Employee("robert de nero", 1,new ShallowCloning().new Address("Kharkar wada","400602"));
		Employee emp2 = (Employee) emp1.clone();
		System.out.println("ORIGINAL");
		System.out.println(emp1.toString());
		System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.println("CLONED");
		System.out.println(emp2.toString());
		
	}

	

}
