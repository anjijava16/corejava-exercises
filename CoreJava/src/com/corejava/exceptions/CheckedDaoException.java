package com.corejava.exceptions;

public class CheckedDaoException extends Exception{

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  public CheckedDaoException() {
    super();
  }

  public CheckedDaoException(String message, Throwable cause) {
    super(message, cause);
  }

}
