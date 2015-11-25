package com.corejava.objectcreation.eg1;

public class Employee {

  private int id;
  private String empname;
  
  
  
/*
  public Employee(int id, String empname) {
    super();
    this.id = id;
    this.empname = empname;
  }
  */

  public int getId() {
    return id;
  }

  @Override
  public String toString() {
    return "Employee [id=" + id + ", empname=" + empname + "]";
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getEmpname() {
    return empname;
  }

  public void setEmpname(String empname) {
    this.empname = empname;
  }



}
