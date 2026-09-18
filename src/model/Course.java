package model;

import java.util.List;

public class Course {
  private int code;
  private String title;
  private List<Student> students;
  private int capacity;
  private Teacher teacher;
  private Room room;

  public int getCode() {
    return code;
  }

  public String getTitle() {
    return title;
  }

  public List<Student> getStudents() {
    return students;
  }

  public int getCapacity() {
    return capacity;
  }

  public Teacher getTeacher() {
    return teacher;
  }

  public Room getRoom() {
    return room;
  }
}
