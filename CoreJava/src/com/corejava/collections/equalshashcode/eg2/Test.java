package com.corejava.collections.equalshashcode.eg2;

import java.util.HashMap;
import java.util.Map;

public class Test {

  public static void main(String[] args) {
    // Override equals not hashcode
    Map<Employee, String> mp = new HashMap<Employee, String>();
    mp.put(new Employee("a", "trushant", "thane"), "trushant");
    System.out.println(mp.toString());
    String empread = mp.get(new Employee("a", "trushant", "thane"));
    System.out.println(empread);
    
    /*
     * Because the hashCode() method is not overridden, these two instances' identities are not in
     * common to the default hashCode implementation. Therefore, the Object.hashCode returns two
     * seemingly random numbers instead of two equal numbers.
     */

  }

}
