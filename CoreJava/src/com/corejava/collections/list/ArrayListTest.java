package com.corejava.collections.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListTest {

  public static void main(String[] args) {

    List<Integer> intgerlist = new ArrayList<>();
    intgerlist.add(1);
    intgerlist.add(2);
    intgerlist.add(3);
    intgerlist.add(4);
    intgerlist.add(5);
    print(intgerlist);

    intgerlist.add(8);

    intgerlist.add(4, 12);
    /*
     * Inserts the specified element at the specified position in this list (optional operation).
     * Shifts the element currently at that position (if any) and any subsequent elements to the
     * right (adds one to their indices).
     */
    print(intgerlist);

    List<Integer> twodigitintgerlist = new ArrayList<>();
    twodigitintgerlist.add(11);
    twodigitintgerlist.add(12);
    intgerlist.addAll(3, twodigitintgerlist);
    /*
     * Inserts all of the elements in the specified collection into this list at the specified
     * position (optional operation). Shifts the element currently at that position (if any) and any
     * subsequent elements to the right (increases their indices). The new elements will appear in
     * this list in the order that they are returned by the specified collection's iterator. The
     * behavior of this operation is undefined if the specified collection is modified while the
     * operation is in progress. (Note that this will occur if the specified collection is this
     * list, and it's nonempty.)
     */
    print(intgerlist);


  }

  private static void print(Collection<Integer> intcollection) {
    System.out.println(intcollection.toString());
  }

}
