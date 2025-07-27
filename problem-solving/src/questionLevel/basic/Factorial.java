package questionLevel.basic;

public class Factorial {
    public static void main(String[] args) {
        int num = 5, factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}

class FactorialRecursion {
    public static void main(String[] args) {
        int num = 5;
        int factorials = 0;
        factorials = factorial(num);
        System.out.println(factorials);
    }

    static int factorial(int n) {
        if (n ==0) return 1;
        return n * factorial(n - 1);
    }
}
