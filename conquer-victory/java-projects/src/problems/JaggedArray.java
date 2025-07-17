package problems;

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
//        int a[][] = {
//                {1,2},
//                {3,4,5}
//        };

        int a[][] = new int[2][];
        a[0] = new int[2];
        a[1] = new int[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
//                System.out.print(a[i][j] + " ");
                System.out.println("Enter for " + i + ", " + j);
                a[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Jagged array is ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
