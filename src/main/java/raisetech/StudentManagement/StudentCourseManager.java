import java.util.ArrayList;
import java.util.List;
import raisetech.StudentManagement.Course;
import raisetech.StudentManagement.Student;
import raisetech.StudentManagement.StudentsCourses;

public class StudentCourseManager {
  private List<Student> students = new ArrayList<>();
  private List<StudentsCourses> courses = new ArrayList<>();

  public void addStudent(Student student) {
    students.add(student);
  }

  public void addCourse(StudentsCourses course) {
    courses.add(course);
  }


}