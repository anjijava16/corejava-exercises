package com.corejava._string.constructor;

public class Example2 {

  public static void main(String[] args) {
    String s1 = "iByteCode";

    String s2 = new String("iByteCode");// Ex2Stmt1.PNG
    /*
     * In this case, because we used ‘new’ keyword a String object is created in the heap
     * memory(without checking if it exists in a pool) even if an equal string object already exists
     * in the pool and ‘s’ will refer to the newly created one.
     */

    System.out.println(s1 == s2);


    s2 = s2.intern();
    /*
     * String objects created with the new operator do not refer to objects in the string pool but
     * can be made to using String’s intern() method. The java.lang.String.intern() returns an
     * interned String, that is, one that has an entry in the global String literal pool. If the
     * String is not already in the global String literal pool, then it will be added. For example,
     */
    System.out.println(s1 == s2);



  }

}
