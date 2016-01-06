package com.corejava.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class Test {

  public static void main(String[] args) {
    Map<Integer,String> test = new HashMap<Integer,String>();
    test.put(1, "test");
    test.put(2, "tester");
    test.put(3, "tested");
    System.out.println(test.toString());
    
    
    
  }

}
