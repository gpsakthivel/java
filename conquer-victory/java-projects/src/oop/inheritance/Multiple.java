package oop.inheritance;

interface A {
    void display();
}

interface B {
    void show();
}

class C implements A, B {
    public void display() {
        System.out.println("in display");
    }

    public void show() {
        System.out.println("in show");
    }
}

public class Multiple {
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
    }
}
