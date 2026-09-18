package model;

import model.enums.Role;

public abstract class Person {
  protected  String id;
  protected String name;
  protected int age;
  protected Role role;

  // Constructor
  public Person(String name, String id, Role role) {
    this.id = id;
    this.name = name;
    this.role = role;
  }

  // Getters / Setters
  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  // Abstract method
  public abstract Role getRole();
}
