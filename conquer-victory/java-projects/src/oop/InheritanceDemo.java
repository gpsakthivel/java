package oop;

class GreatGrandParent {
    int a;
    void display() {
        System.out.println("Great Grand Parent");
    }
}

class GrandParent extends GreatGrandParent {
    int b;
    void hello() {
        System.out.println("Grand Parent");
    }
}

class Parent extends GrandParent {
    int c;
    void hi() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    int d;
    void show() {
        System.out.println("Child");
    }
}

// Inheritance - Accessing the variables and methods of super class using sub class object
// Parent class - Base class or Super class
// Child class - Derived class or Sub class
// Types:
// Single
// Multilevel
// Hierarchical
// Multiple (not supported directly)
// Hybrid (not supported directly)


public class InheritanceDemo {
    public static void main(String[] args) {
//        Parent p = new Parent();
//        Child c = new Child();
//        c.a = 10;
//        c.b = 20;
//        c.c = 30;
//        c.d = 40;
//        c.display();
//        c.hello();
//        c.hi();
//        c.show();
//        System.out.println(c.a);
//        System.out.println(c.b);
//        System.out.println(c.c);
//        System.out.println(c.d);

        C1 obj = new C1();
        obj.display();
        obj.show1();
    }
}

class A {
    void display() {
        System.out.println("Parent");
    }
}

class C1 extends A {
    void show1() {
        System.out.println("Child 1");
    }
}

class C2 extends A {
    void show2() {
        System.out.println("Child 2");
    }
}