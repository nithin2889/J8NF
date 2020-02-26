package com.j8nf.interfaces;

public interface iDefault {
  default void someRandomMethod() {
    System.out.println("default method!");
  }
}
