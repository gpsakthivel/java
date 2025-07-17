package oop;

class Abc {
    // Instance variable
    int num1;
    int num2;

//    void getData(int a, int b) {
//        // Local variable
//        num1 = a;
//        num2 = b;
//    }

    void getData(int num1, int num2) {
        // Local variable
        this.num1 = num1;
        this.num2 = num2;
    }

    void display() {
        System.out.println(num1);
        System.out.println(num2);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        Abc a = new Abc();
        a.getData(10, 20);
        a.display();
    }
}
