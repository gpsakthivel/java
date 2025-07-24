package interfaces;

interface A {
    // variables - static and final
    // methods - only abstract method

    int age = 22;
    void show(); // public abstract
    void display();
}

abstract class B {
    void show() {
        System.out.println("show");
    };
    abstract void display();
}

class Aimplement implements A {

    @Override
    public void show() {
        System.out.println("in show");
    }

    @Override
    public void display() {
        System.out.println("in display");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        A obj = new Aimplement();
        obj.display();
        obj.show();
    }
}
