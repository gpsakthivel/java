package oop;

class Outer {

    int age = 16;

//    public void show() {
//        System.out.println("In show method");
//    }

//    private class Inner {
//        public void show() {
//            System.out.println("In show method...");
//        }
//    }
//
//    public void getAccess() {
//        Inner in = new Inner();
//        in.show();
//    }

    public void getAccess() {
        class Inner {
            public void show() {
                System.out.println("In show method...");
            }
        }

        Inner in = new Inner();
        in.show();
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        // Outer obj = new Outer();
        // System.out.println(obj.age);
        // obj.show();

        // non-static nested inner class
        // Outer.Inner in = obj.new Inner();
        //  in.show();

        // static nested inner class
        // Outer.Inner in = new Outer.Inner();
        // in.show();

        // method local inner class
        // Outer obj = new Outer();
        // obj.getAccess();

        // anonymous inner class
        Outer obj = new Outer() {
            public void show() {
                System.out.println("In show method");
            }
        };
        obj.getAccess();
    }
}
