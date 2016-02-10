package com.corejava.exceptions;

public class TestUncheckedException {

  public static void main(String[] args) {
       
    IService service = new ServiceImpl(new DaoImpl());
    service.getName(1);
    
    /*
     * 
     * one can read unchecked exception stacktrace topdown with causing exception at top.
     * 
     * Exception in thread "main" com.corejava.exceptions.UncheckedDaoException: problem reading name
    at com.corejava.exceptions.DaoImpl.getName(DaoImpl.java:7)
    at com.corejava.exceptions.ServiceImpl.getName(ServiceImpl.java:14)
    at com.corejava.exceptions.TestUncheckedException.main(TestUncheckedException.java:8)
    Caused by: java.lang.RuntimeException
    ... 3 more

     * 
     * */
    
  }

}
