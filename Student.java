import java.util.ArrayList;
import java.util.List;

enum FormOfEducation {
  IN_PERSON,
  FROM_DISTANCE,
  PARTIAL
}

class Student extends Person {
  private String faculty_number;
  private List<Course> courses;
  private List<Double> grades;
  private FormOfEducation form_of_education;

  public Student(String name, String id, Role role) {
    super(name, id, role);
    this.faculty_number = "";
    this.courses = new ArrayList<>();
    this.grades = new ArrayList<>();
    this.form_of_education = FormOfEducation.IN_PERSON;
  }

  // Enroll/drop courses

  public void enroll(Course course) {
    this.courses.add(course);
    grades.add(0.0);
  }

  public void assignMarks(Course course, double grade) {
    int index = courses.indexOf(course);
    if (index != -1) {
      grades.set(index, grade)
    }
  }

  public void dropCourse(Course course) {
    int index = courses.indexOf(course);
    this.courses.remove(index);
  }
}
