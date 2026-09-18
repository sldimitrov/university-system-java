package model;

import java.util.ArrayList;
import java.util.List;
import model.enums.FormOfEducation;
import model.enums.Role;

public class Student extends Person {
  private String facultyNumber;
  private List<Course> courses;
  private List<Double> grades;
  private FormOfEducation formOfEducation;

  public Student(String name, String id, Role role, String facultyNumber) {
    super(name, id, role);
    this.facultyNumber = "";
    this.courses = new ArrayList<>();
    this.grades = new ArrayList<>();
    this.formOfEducation = FormOfEducation.IN_PERSON;
  }

  // Setters / Getters
  public String getFacultyNumber() {
    return facultyNumber;
  }

  public void setFacultyNumber(String facultyNumber) {
    this.facultyNumber = facultyNumber;
  }

  public List<Course> getCourses() {
    return courses;
  }

  public List<Double> getGrades() {
    return grades;
  }

  public FormOfEducation getFormOfEducation() {
    return formOfEducation;
  }

  public void setFormOfEducation(FormOfEducation formOfEducation) {
    this.formOfEducation = formOfEducation;
  }

  // Business Logic
  public void enroll(Course course) {
    this.courses.add(course);
    grades.add(0.0);
  }

  public void assignMarks(Course course, double grade) {
    int index = courses.indexOf(course);
    if (index != -1) {
      grades.set(index, grade);
    } else {
      System.out.println("Invalid operation! Course is not found!");
    }
  }

  public void dropCourse(Course course) {
    int index = courses.indexOf(course);
    if (index != -1) {
      this.courses.remove(index);
    } else {
      System.out.println("Invalid operation! Course is not found!");
    }
  }

  // Overriding parent method
  @Override
  public Role getRole() {
    return Role.STUDENT;
  }
}
