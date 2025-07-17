package keyword;

class Student {
    String name;
    int age;
    static String teacher;

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Teacher : " + teacher);
    }

    static {
        Student.teacher = "Ravi";
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "Rohit";
        s1.age = 19;
//        s1.teacher = "Ravi";
//        s1.teacher = "Dravid";
//        Student.teacher = "Dravid";
        s2.name = "Dhawan";
        s2.age = 20;
//        s2.teacher = "Ravi";
//        Student.teacher = "Mahi";
        s1.display();
        s2.display();
    }
}
