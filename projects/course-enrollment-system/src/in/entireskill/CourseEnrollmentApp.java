package in.entireskill;

import java.util.ArrayList;
import java.util.Scanner;

public class CourseEnrollmentApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Admin admin = new Admin("AdminUser");

        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();
        ArrayList<Enrollment> enrollments = new ArrayList<>();

        int studentIdCounter = 1001;

        while (true) {
            admin.showMenu();
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Student Name");
                    String studentName = sc.nextLine();
                    Student student = new Student(studentIdCounter++, studentName);
                    students.add(student);
                    System.out.println("Student Added with ID" + student.getId());
                    break;
                case 2:
                    System.out.println("Enter Course Code");
                    String code = sc.nextLine();
                    System.out.println("Enter Course Name");
                    String courseName = sc.nextLine();
                    Course course = new Course(code, courseName);
                    courses.add(course);
                    System.out.println("Course added successfully");
                    break;
                case 3:
                    if (students.isEmpty() || courses.isEmpty()) {
                        System.out.println("Add Students and Courses first");
                    }
                    System.out.println("Available Students:");
                    for(Student s: students) {
                        System.out.println(s.getId() + " " + s.getName());
                    }
                    System.out.println("Enter Student ID to enroll");
                    int sid = sc.nextInt();
                    sc.nextLine();

                    Student selectedStudent = null;
                    for(Student s: students) {
                        if (s.getId() == sid) {
                            selectedStudent = s;
                            break;
                        }
                    }
                    if (selectedStudent == null) {
                        System.out.println("Invalid Student ID");
                    }
                    System.out.println("Available Courses");
                    for (Course c: courses) {
                        System.out.println(c.getCourseCode() + " : " + c.getCourseName());
                    }
                    System.out.println("Enter Course code to enroll: ");
                    String selectedCode = sc.nextLine();
                    Course selectedCourse = null;
                    for (Course c: courses) {
                        if (c.getCourseCode().equalsIgnoreCase(selectedCode)) {
                            selectedCourse = c;
                            break;
                        }
                    }
                    if (selectedCourse == null) {
                        System.out.println("Invalid Course Code");
                    }
                    enrollments.add(new Enrollment(selectedStudent, selectedCourse));
                    System.out.println("Enrollment successful");
                    break;
                case 4:
                    if (enrollments.isEmpty()) {
                        System.out.println("No Enrollment yet");
                        break;
                    }
                    System.out.println("Enrollments:");
                    for (Enrollment e: enrollments) {
                        e.displayEnrollment();
                        System.out.println("----------------");
                    }
                    break;
                case 5:
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
