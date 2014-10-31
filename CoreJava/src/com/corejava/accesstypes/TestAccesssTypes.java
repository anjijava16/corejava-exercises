package com.corejava.accesstypes;


public class TestAccesssTypes {

	public static void main(String[] args) {
		Employee employee = new Employee(1, "mark", "silicon valley", "idiotbox");
		//trying to access private member
		//employee.id=0; error field employee id is not visible

		//trying to access package private member
		System.out.println(employee.employeeName);
		
		//access protected member
		System.out.println(employee.employeeAddress);
		
		//access public member
		System.out.println(employee.employeeCompany);
	}

}
