package onlinevideos;

class Student {
    String name;
    int rank;

    void display() {
        System.out.println("Name : " + name);
    }
}
public class ClassDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Raina";
        s1.rank = 4;
        s1.display();
    }
}
