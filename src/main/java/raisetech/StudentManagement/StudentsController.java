package raisetech.StudentManagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/students")
public class StudentsController {

  @GetMapping("/courses")
  public List<StudentsCourses> getCourses() {
    // コースのリストを返すロジック
    List<StudentsCourses> courses = new ArrayList<>();
    // サンプルデータを追加
    StudentsCourses course = new StudentsCourses();
    course.setCourseId("C001");
    course.setCourseName("Mathematics");
    course.setStartDate(LocalDateTime.now());
    course.setEndDate(LocalDateTime.now().plusMonths(3));
    course.setStudentIDs(Arrays.asList("S001", "S002", "S003"));
    courses.add(course);
    return courses;
  }

  @PostMapping("/courses")
  public StudentsCourses createCourse(@RequestBody StudentsCourses course) {
    // 新しいコースを作成するロジック
    course.setStartDate(LocalDateTime.now());
    course.setEndDate(LocalDateTime.now().plusMonths(3));
    return course;
  }

  @GetMapping("/AllCourses")
  public List<StudentsCourses> getAllCourses() {
    return StudentRepository.findAllCourses();
  }

}