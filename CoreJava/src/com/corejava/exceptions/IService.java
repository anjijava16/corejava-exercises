package com.corejava.exceptions;

public interface IService {

  public String getName(int id);
  public String getAddress(int id)throws CheckedServiceException;
  
}
