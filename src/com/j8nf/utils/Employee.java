package com.j8nf.utils;

import java.util.Objects;

public class Employee {
  private String name;
  private String designation;
  private Double salary;
  private String location;

  public Employee(String name, String designation, Double salary, String location) {
    this.name = name;
    this.designation = designation;
    this.salary = salary;
    this.location = location;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employee employee = (Employee) o;
    return Objects.equals(name, employee.name) &&
        Objects.equals(designation, employee.designation) &&
        Objects.equals(salary, employee.salary) &&
        Objects.equals(location, employee.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, designation, salary, location);
  }

  @Override
  public String toString() {
    return "Employee{" +
        "name='" + name + '\'' +
        ", designation='" + designation + '\'' +
        ", salary=" + salary +
        ", location='" + location + '\'' +
        '}';
  }
}
