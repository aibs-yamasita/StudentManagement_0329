package raisetech.StudentManagement;

import java.time.LocalDateTime;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentsCourses {
  private String courseId;
  private String courseName;
  private LocalDateTime startDate;
  private LocalDateTime endDate;
  private List<String> studentIDs;
}
