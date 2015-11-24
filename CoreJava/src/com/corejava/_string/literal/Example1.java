package com.corejava._string.literal;

public class Example1 {

  public static void main(String[] args) {

    String s1 = "test";
    /*
     * JVM checks the String constant pool first and if the string does not exist, it creates a new
     * String object “test” and a reference is maintained in the pool. The variable ‘s1′ also refers
     * the same object. This statement creates one String object “test”. Ex1Stmt1.PNG
     */

    String s2 = "test";
    /*
     * 
     * JVM checks the String constant pool first and since the string already exists, a reference to
     * the pooled instance is returned to s2. This statement does not create any String object in
     * the memory and ‘s2′ refers the same object as ‘s1′. Ex1Stmt2.png
     */

    /*
     * 
     * To check this, you can compare two String references using == operator to check whether two
     * references are referring to the same String object in the memory.
     */

    System.out.println(s1 == s2);// == compares heap address locations pointed to by s1 and s2
    
    
    /*
     * Java can make this optimization since strings are immutable and can be shared without fear of
     * data corruption. For example, if several reference variables refer to the same String object
     * then it would be bad if any of them changes the String’s value. This is the reason for making
     * String objects as immutable.
     */


  }

}
