package in.entireskill;

public class Enrollment {

    private Student student;
    private Course course;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public void displayEnrollment() {
        System.out.println("Student: " + student.getName() + "(ID: " + student.getId() + ")");
        System.out.println("Enrolled In: " + course.getCourseName() + "(Code: " + course.getCourseCode() + ")");
    }
}
