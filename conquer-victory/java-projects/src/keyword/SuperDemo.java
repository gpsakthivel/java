package keyword;

class P {
    public P() {
        System.out.println("In parent default constructor");
    }

    public P(int i) {
        // super();
        System.out.println("In parent param constructor " + i);
    }

    int a = 10;
    public void display() {
        System.out.println("In parent display" + a);
    }
}

class C extends P {
    public C() {
        // super();
        System.out.println("In child default constructor");
    }

    public C(int i) {
        super(10+2);
        System.out.println("In child param constructor " + i);
    }

    int a = 20;
    public void display() {
        System.out.println("In child display");
        System.out.println("a : " + a);
        System.out.println("parent a : " + super.a);
    }
}

// Super
// It can be used to access immediate parent class variables, methods, and constructors from child class.
// It is achieved by inheritance.
// Note: Name of the base class and derived class variables, methods should be same.
public class SuperDemo {
    public static void main(String[] args) {
        C obj = new C(10);
        obj.display();
    }
}
