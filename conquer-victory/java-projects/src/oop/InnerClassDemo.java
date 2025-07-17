package oop;

class Outer {

    public void show() {
        System.out.println("In show method");
    }

    static class Inner {
        public void show() {
            System.out.println("In show method...");
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.show();
        // For non-static
//        Outer.Inner in = obj.new Inner();
//        in.show();
        // For static
        Outer.Inner in = new Outer.Inner();
        in.show();
    }
}
