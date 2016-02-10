package com.corejava.exceptions;

public class TestCheckedException {

  public static void main(String[] args) {
    
    IService service = new ServiceImpl(new DaoImpl());
    try {
      service.getAddress(5);
    } catch (CheckedServiceException e) {
      e.printStackTrace();
    }
    
    /*
     * one can read checked exception stacktrace downup,with causing exception at the downmost of stacktrace 
     * com.corejava.exceptions.CheckedServiceException: checked service exception
    at com.corejava.exceptions.ServiceImpl.getAddress(ServiceImpl.java:22)
    at com.corejava.exceptions.TestCheckedException.main(TestCheckedException.java:9)
Caused by: com.corejava.exceptions.CheckedDaoException: problem reading address
    at com.corejava.exceptions.DaoImpl.getAddress(DaoImpl.java:12)
    at com.corejava.exceptions.ServiceImpl.getAddress(ServiceImpl.java:20)
    ... 1 more
Caused by: java.lang.Exception
    ... 3 more

     * 
     * 
     * 
     * */
    
  }

}
