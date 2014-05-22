package com.corejava.equality;

import java.util.HashSet;
import java.util.Set;


public class Test_3 {
	
	public class Emp{
		private Long id;
		public Emp(Long idv){
			id=idv;
		}
		public Long getId() {
			return id;
		}
		
	
		public boolean equals(Object obj) {
			boolean rt = false;
			Emp emp = (Emp)obj;
			if(id.equals(emp.id)){
				rt = true;
			}
			return rt;
		 }
		
		
		public int hashCode(){
			return 5*id.hashCode();
		}
		
		
		
		
	}

	public static void main(String[] args) {
		
		
		Emp e1 = new Test_3().new Emp(1L);
		Emp e2 = new Test_3().new Emp(1L);
		
		Set<Emp> empSet = new HashSet<Emp>();
		empSet.add(e1);
		empSet.add(e2);
		System.out.println(empSet.size());
		
	
		

	}
}
