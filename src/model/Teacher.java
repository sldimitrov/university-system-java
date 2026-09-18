package model;

import java.util.List;
import model.enums.Role;

public class Teacher extends Person {
  private String department;
  private List<Course> coursesTaught;

  public String getDepartment() {
    return department;
  }

  public List<Course> getCoursesTaught() {
    return coursesTaught;
  }
}
