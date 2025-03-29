package raisetech.StudentManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/StudentsCourses")
public class StudentsCoursesController {

  @Autowired
  private CourseService courseService;


  @GetMapping
  public List<Course> getAllCourses() {
    return courseService.getAllCourses();
  }
}