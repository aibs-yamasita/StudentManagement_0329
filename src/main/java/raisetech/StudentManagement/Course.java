package raisetech.StudentManagement;

public class Course {
  private String courseId;
  private String courseName;
  private String startDate;
  private String endDate;

  public Course(String courseId, String courseName, String startDate, String endDate) {
    this.courseId = courseId;
    this.courseName = courseName;
    this.startDate = startDate;
    this.endDate = endDate;
  }

  // ゲッターとセッターを追加
  public String getCourseId() { return courseId; }
  public void setCourseId(String courseId) { this.courseId = courseId; }
  public String getCourseName() { return courseName; }
  public void setCourseName(String courseName) { this.courseName = courseName; }
  public String getStartDate() { return startDate; }
  public void setStartDate(String startDate) { this.startDate = startDate; }
  public String getEndDate() { return endDate; }
  public void setEndDate(String endDate) { this.endDate = endDate; }
}
