package com.j8nf.functionalinterfaces.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

  public static final Predicate<Integer> p1 = i -> i > 10;
  public static final Predicate<String> p2 = s -> s.length() > 10;
  public static final Predicate<Collection<String>> p3 = c -> c.isEmpty();

  public static void main(String[] args) {
    // test a given integer is greater than 10
    System.out.println("10 is greater than 10? " + p1.test(10));
    System.out.println("3452 is greater than 10? " + p1.test(3452));

    // return the given string's length
    System.out.println("Is the string length greater than 10? " + p2.test("Nithin Prasad"));

    // check of the collection is empty or not
    List<String> l1 = new ArrayList<>();
    l1.add("A");
    System.out.println("Is the collection empty? " + p3.test(l1));

    List<String> l2 = new ArrayList<>();
    System.out.println("Is the collection empty? " + p3.test(l2));
  }
}
