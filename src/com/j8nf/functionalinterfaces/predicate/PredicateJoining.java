package com.j8nf.functionalinterfaces.predicate;

import java.util.function.Predicate;

public class PredicateJoining {
  public static void main(String[] args) {
    int[] x = {0, 5, 10, 15, 20, 25, 30};

    Predicate<Integer> p1 = i -> i > 10;
    Predicate<Integer> p2 = i -> i % 2 == 0;

    System.out.println("Numbers greater than 10 are: ");
    PredicateJoining.predicateTester(p1, x);

    System.out.println();

    System.out.println("Even numbers are: ");
    PredicateJoining.predicateTester(p2, x);

    System.out.println();

    System.out.println("Numbers greater than 10 and even numbers are: ");
    PredicateJoining.predicateTester(p1.and(p2), x);

    System.out.println();

    System.out.println("Numbers greater than 10 or even numbers are: ");
    PredicateJoining.predicateTester(p1.or(p2), x);
  }

  private static void predicateTester(Predicate<Integer> p, int[] x) {
    for (int x1 : x) {
      if (p.test(x1)) {
        System.out.println(x1);
      }
    }
  }
}
