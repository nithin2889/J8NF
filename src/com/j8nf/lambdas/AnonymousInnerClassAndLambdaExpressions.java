package com.j8nf.lambdas;

import com.j8nf.interfaces.iTest;

public class AnonymousInnerClassAndLambdaExpressions {
  int x = 10;

  public static void main(String[] args) {
    AnonymousInnerClassAndLambdaExpressions aicale = new AnonymousInnerClassAndLambdaExpressions();
    aicale.lambdaExpression();
    aicale.anonymousInnerClass();
  }

  // using anonymous inner class
  public void anonymousInnerClass() {
    iTest it =
        new iTest() {
          int x = 20;

          @Override
          public void someRandomMethod() {
            System.out.println("anonymous inner class x value: " + this.x);
            System.out.println(
                "anonymous inner class instance variable x value: "
                    + AnonymousInnerClassAndLambdaExpressions.this.x);
          }
        };
    it.someRandomMethod();
  }

  // using lambda expression
  public void lambdaExpression() {
    // Here, the variable "y" acts as a local variable.
    int y = 20;

    // This code block is considered as a "closure". In this block the local variables
    // will be freezed or final by default.
    iTest it =
        () -> {
          System.out.println("lambda expression x value: " + x);
          // Local variable referenced from lambda expression are final or effectively final.
          System.out.println("lambda expression y value: " + y);
        };
    it.someRandomMethod();
  }
}
