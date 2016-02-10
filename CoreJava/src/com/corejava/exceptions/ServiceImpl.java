package com.corejava.exceptions;

public class ServiceImpl implements IService{

  private IDao dao;
  
  public ServiceImpl(IDao dao) {
    super();
    this.dao = dao;
  }

  @Override
  public String getName(int id) {
    return dao.getName(id);
  }

  @Override
  public String getAddress(int id) throws CheckedServiceException {
    try {
      return dao.getAddress(id);
    } catch (CheckedDaoException e) {
      throw new CheckedServiceException("checked service exception", e);
    }
  }

}
