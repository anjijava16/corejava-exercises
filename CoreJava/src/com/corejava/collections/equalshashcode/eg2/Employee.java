package com.corejava.collections.equalshashcode.eg2;

public class Employee {

  private String id;
  private String employeeName;
  private String address;
  
  
  public Employee(String id, String employeeName, String address) {
    super();
    this.id = id;
    this.employeeName = employeeName;
    this.address = address;
  }
  public String getId() {
    return id;
  }
  public String getEmployeeName() {
    return employeeName;
  }
  public String getAddress() {
    return address;
  }
  
  @Override
  public String toString() {
    return "Employee [id=" + id + ", employeeName=" + employeeName + ", address=" + address + "]";
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
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }
  
  
  
}
