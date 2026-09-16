import java.util.List;

enum FormOfEducation {
  IN_PERSON,
  FROM_DISTANCE,
  PARTIAL
}

class Student extends Person {
  String faculty_number;
  String discipline;
  List<Course> courses;
  List<int> grades;
  // String qualification_level;
  FormOfEducation form_of_education;
  Boolean is_payed;

  // Enroll/drop courses

  // public void enroll(Course course) {}
  // public void dropCourse(Course course) {}
}
