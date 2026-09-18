package model;

import java.util.List;

public class University {
  private String name;
  private List<Course> courses;
  private List<Teacher> teachers;
  private List<Student> students;
  private List<Room> rooms;

  public University(String name, List<Course> courses, List<Teacher> teachers, List<Student> students, List<Room> rooms) {
    this.name = name;
    this.courses = courses;
    this.teachers = teachers;
    this.students = students;
    this.rooms = rooms;
  }

  public String getName() {
    return name;
  }

  public List<Course> getCourses() {
    return courses;
  }

  public List<Teacher> getTeachers() {
    return teachers;
  }

  public List<Student> getStudents() {
    return students;
  }

  public List<Room> getRooms() {
    return rooms;
  }

  public void enrollStudentInCourse(Student student, Course course) {
    // course.addStudent(student);
  }
}
