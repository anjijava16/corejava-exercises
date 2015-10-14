package com.corejava.finalkeyword;

public class Test {

  public static void main(String[] args) {
  
    Employee emp = new Employee(1, "trd");
    System.out.println("Before adding tasks");
    System.out.println(emp);
    
    emp.addTask("get files");
    emp.addTask("prepare report");
    emp.addTask("attend meeting");
    emp.addTask("submit report");
    System.out.println("after adding tasks");
    System.out.println(emp);
        
    emp.removeTask("get files");
    emp.removeTask("prepare report");
    System.out.println("after removing few tasks");
    System.out.println(emp);
   
  }

}
