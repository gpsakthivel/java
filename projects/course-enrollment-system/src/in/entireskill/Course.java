package in.entireskill;

public class Course {

    private String courseName;
    private String courseCode;

    public Course(String name, String courseCode) {
        courseName = name;
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }
}
