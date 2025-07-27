package questionLevel.basic;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 11;
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
    }
}

class PrimeNumberInRange {
    public static void main(String[] args) {
        int start = 10, end = 50;
        for (int num = start; num <= end; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime && num > 1) {
                System.out.println("Num : " + num + ", Prime : " + isPrime);
            }
        }
    }
}
