package oop;

class Welcome {
    public void greet(String name, int age) {
        System.out.println("Welcome " + name + ", " + age);
    }

    public int add(int a, int b) {
        return a + b;
    }
}


// Reusability
public class MethodsDemo {

    public void display() {
        System.out.println("In display");
    }

    public static void main(String[] args) {
        Welcome obj = new Welcome();
        obj.greet("Ram", 21);
        int op = obj.add(5, 10);
        System.out.println(op);

        MethodsDemo md = new MethodsDemo();
        md.display();
    }
}
