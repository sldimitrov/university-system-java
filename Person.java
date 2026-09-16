enum Role {
  TEACHER,
  STUDENT
}

class Person {
  private int id;
  private String first_name;
  private String last_name;
  private int age;
  private String number;
  private String birth_place;
  private String gender;
  private Role role;

  public int getId() {
    return id;
  }

  public String getName() {
    return first_name + " " + last_name;
  }

  public int getAge() {
    return age;
  }

  public String getNumber() {
    return number;
  }

  public String birth_place() {
    return birth_place;
  }

  public String gender() {
    return gender;
  }

  // public abstract String getRole();

  // public abstract List getSchedule;
}
