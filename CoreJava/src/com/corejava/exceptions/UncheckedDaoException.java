package com.corejava.exceptions;

public class UncheckedDaoException extends RuntimeException {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  public UncheckedDaoException() {
    super();
  }

  public UncheckedDaoException(String message, Throwable cause) {
    super(message, cause);
  }

}
