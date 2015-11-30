package com.corejava.collections.equalshashcode.eg1;

public class Employee {

  private int id;
  private String empname;

  public Employee(int id, String empname) {
    super();
    this.id = id;
    this.empname = empname;
  }

  public int getId() {
    return id;
  }

  public String getEmpname() {
    return empname;
  }

  @Override
  public String toString() {
    return "Employee [id=" + id + ", empname=" + empname + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    return result;
  }

  
  
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Employee other = (Employee) obj;
    if (id != other.id)
      return false;
    return true;
  }

  
  
  

}
