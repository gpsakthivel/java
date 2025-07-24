package interfaces.types;

@FunctionalInterface // Lambda expression
interface MyInterface {
    void display(int i);
}

//class MyClass implements MyInterface {
//
//    @Override
//    public void display() {
//        System.out.println("in display");
//    }
//}


public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        // Anonymous inner class expression
//        MyInterface obj = new MyInterface() {
//            public void display() {
//                System.out.println("in display");
//            }
//        };

        // Lambda expression
        MyInterface obj = (int i) -> System.out.println("in display " + i);
        obj.display(5);
    }
}
