package model;

import java.util.ArrayList;
import java.util.List;
import model.enums.FormOfEducation;
import model.enums.Role;

public class Student extends Person {
  private String facultyNumber;
  private List<Course> courses;
  private List<Double> grades;
  private FormOfEducation form_of_education;

  public Student(String name, String id, Role role) {
    super(name, id, role);
    this.facultyNumber = "";
    this.courses = new ArrayList<>();
    this.grades = new ArrayList<>();
    this.form_of_education = FormOfEducation.IN_PERSON;
  }

  public void enroll(Course course) {
    this.courses.add(course);
    grades.add(0.0);
  }

  public void assignMarks(Course course, double grade) {
    int index = courses.indexOf(course);
    if (index != -1) {
      grades.set(index, grade);
    }
  }

  public void dropCourse(Course course) {
    int index = courses.indexOf(course);
    this.courses.remove(index);
  }

  public String getFacultyNumber() {
    return facultyNumber;
  }

  public List<Course> getCourses() {
    return courses;
  }

  public List<Double> getGrades() {
    return grades;
  }

  public FormOfEducation getFormOfEducation() {
    return form_of_education;
  }
}
