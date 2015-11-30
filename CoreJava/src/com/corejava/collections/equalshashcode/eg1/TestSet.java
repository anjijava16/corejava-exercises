package com.corejava.collections.equalshashcode.eg1;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

  public static void main(String[] args) {
   Set<Employee> set = new HashSet<Employee>();
   set.add(new Employee(1, "1_truemp"));
   set.add(new Employee(2, "2_truemp"));
   set.add(new Employee(2, "2_truemp"));

   System.out.println(set.toString());
   
  }

}
