package com.corejava.exceptions;

public interface IDao {

  public String getName(int id);
  public String getAddress(int id)throws CheckedDaoException;
}
