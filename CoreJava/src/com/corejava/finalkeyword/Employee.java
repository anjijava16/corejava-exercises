package com.corejava.finalkeyword;

import java.util.ArrayList;
import java.util.List;

public final class Employee {


  private long id;
  private String name;
  private final List<String> tasks = new ArrayList<String>();
  // final member variable needs to be initialized
  // in a same statement where it is declared
  
  public Employee(long id, String name) {
    super();
    this.id = id;
    this.name = name;
  }
  
  public void addTask(String task){
    this.tasks.add(task);
  }
  
  public void removeTask(String task){
    this.tasks.remove(task);
  }

  @Override
  public String toString() {
    return "Employee [id=" + id + ", name=" + name + ", tasks= "+tasks+"]";
  }
  
  public final String getName(){
    return this.name;
  }
  
  public void initializeTasks(){
    //this.tasks=new ArrayList<String>();
    //cannot reassign final field :The final field Employee.tasks cannot be assigned
  }

  public Employee() {
    super();
    // TODO Auto-generated constructor stub
  }

}
