package problems;

public class EnhancedLoop {
    public static void main(String[] args) {
        // Enhanced for loop
        int a[] = {1,2,3,4,5};

        for(int value: a) {
            System.out.print(value + " ");
        }
        System.out.println();

        int b[][] = {
            {1,2,3},
            {1,2,3},
            {1,2,3}
        };

        for(int temp[]: b) {
            for(int value: temp) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
