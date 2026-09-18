package model;

import java.util.List;

public class Course {
  private int code;
  private String title;
  private List<Student> students;
  private int capacity;
  private Teacher teacher;
  private Room room;

  // Constructor
  public Course(int code, String title, List<Student> students, int capacity, Teacher teacher, Room room) {
    this.code = code;
    this.title = title;
    this.students = students;
    this.capacity = capacity;
    this.teacher = teacher;
    this.room = room;
  }

  // Setters / Getters
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

  // Business logic

  // Used for prettier instance's print
  // @Override
  // public String toString() {
  //   return "";
  // }
}
