package oop;

class Solution {
    int num1;
    int num2;
    int result;

    // Default constructor
    Solution() {
        num1 = 10;
        num2 = 20;
        System.out.println("Default constructor is called");
    }

    // Parameterized constructor
    Solution(int a, int b) {
        num1 = a;
        num2 = b;
        System.out.println("Parameterized constructor is called");
    }

    void display() {
        result = num1 + num2;
        System.out.println("Result : " + result);
    }
}

public class ConstructorDemo {

    ConstructorDemo() {}

    public static void main(String[] args) {
        // Default constructor
        Solution obj = new Solution();

        // Parameterized constructor
        Solution obj2 = new Solution(100, 200);

        // Call the method
        obj.display();
        obj2.display();
    }
}
