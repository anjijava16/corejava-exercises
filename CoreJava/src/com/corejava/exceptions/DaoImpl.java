package com.corejava.exceptions;

public class DaoImpl implements IDao {

  @Override
  public String getName(int id) {
    throw new UncheckedDaoException("problem reading name", new RuntimeException());
  }

  @Override
  public String getAddress(int id) throws CheckedDaoException {
    throw new CheckedDaoException("problem reading address", new Exception());
    
  }

}
