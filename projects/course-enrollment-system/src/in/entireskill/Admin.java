package in.entireskill;

// Inheritance
public class Admin extends User {
    // Constructor
    public Admin(String username) {
        // Super - to call base class
        super(username);
    }

    // To override the abstract class method
    @Override
    public void showMenu() {
        System.out.println("Welcome, " + username + " Choose an action");
        System.out.println("1. Add Student");
        System.out.println("2. Add Course");
        System.out.println("3. Enroll Student");
        System.out.println("4. View Enrollment");
        System.out.println("5. Exit");
    }
}
