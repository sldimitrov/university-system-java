enum Role {
  TEACHER,
  STUDENT
}

class Person {
  private String id;
  private String name;
  private int age;
  private Role role;

  public Person(String id, String name, Role role) {
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

  // public abstract String getRole();

  // public abstract List getSchedule;
}
