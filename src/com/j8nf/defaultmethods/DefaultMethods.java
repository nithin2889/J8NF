package com.j8nf.defaultmethods;

import com.j8nf.interfaces.iDefault;

public class DefaultMethods implements iDefault {
  public static void main(String[] args) {
    DefaultMethods dm = new DefaultMethods();
    // An interface's default methods are by default available to the implementation class.
    // Default methods can be happily overridden in the implementation class.
    dm.someRandomMethod();
  }
}
