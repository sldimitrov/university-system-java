package model;

import java.util.List;
import model.enums.Role;

public class Teacher extends Person {
  private String department;
  private List<Course> coursesTaught;

  public Teacher(String name, String id, Role role, String department, List<Course> coursesTaught) {
    super(name, id, role);
    this.role = role;
    this.department = department;
    this.coursesTaught = coursesTaught;
  }

  public String getDepartment() {
    return department;
  }

  public List<Course> getCoursesTaught() {
    return coursesTaught;
  }

  @Override
  public Role getRole() {
    return Role.TEACHER;
  }
}
