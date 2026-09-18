package model;

import model.enums.Role;

public class Person {
  private String id;
  private String name;
  private int age;
  private Role role;

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

  public Role getRole() {
    return role;
  }
}
