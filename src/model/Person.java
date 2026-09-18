package model;

import model.enums.Role;

public abstract class Person {
  protected  String id;
  protected String name;
  protected int age;
  protected Role role;

  public Person(String name, String id, Role role) {
    this.id = id;
    this.name = name;
    this.role = role;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public abstract Role getRole();
}
