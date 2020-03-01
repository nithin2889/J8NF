package com.j8nf.functionalinterfaces.predicate;

import com.j8nf.utils.Employee;
import java.util.function.Predicate;

public class PredicateStaticMethod {
  public static void main(String[] args) {
    Predicate<Employee> isPO = Predicate.isEqual(
        new Employee("Adelina", "PO", 76738.2, "Mysore"));

    System.out.println("Employees who are not a PO");
    Employee e1 = new Employee("Nithin", "CEO", 1219210.1, "Bangalore");
    Employee e2 = new Employee("Akhila", "GM", 241213.0, "Mysore");

    System.out.println(isPO.test(e1));
    System.out.println(isPO.test(e2));
  }
}
