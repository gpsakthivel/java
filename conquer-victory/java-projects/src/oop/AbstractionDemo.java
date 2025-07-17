package oop;

abstract class Employee {
    abstract void display();
    void show() {
        System.out.println("Abstract show");
    }
}

class Servent extends Employee {
    void display() {
        System.out.println("Abstract method In Derived Class");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Servent obj = new Servent();
        obj.display();
        obj.show();
    }
}
