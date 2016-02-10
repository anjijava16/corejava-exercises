package com.corejava.exceptions;

public class CheckedServiceException extends Exception{

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  public CheckedServiceException() {
    super();
  }

  public CheckedServiceException(String message, Throwable cause) {
    super(message, cause);
  }

  
}
