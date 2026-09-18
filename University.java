import java.util.List;

public class University {
  String name;
  private List<Course> courses;
  private List<Teacher> teachers;
  private List<Student> students;
  private List<Room> rooms;

  public University(List<Course> courses, List<Teacher> teacher, List<Student> students, List<Room> rooms) {
    this.courses = courses;
    this.teachers = teacher;
    this.students = students;
    this.rooms = rooms;
  }

  public void enrollStudentInCourse(Student student, Course course) {
    // course.addStudent(student);
  };

  // public List<Course> getCoursesByTeacher(Teacher teacher) {

  // }

  // public boolean isRoomAvailable(Room room, TimeSlot slot) {

  // }
}
