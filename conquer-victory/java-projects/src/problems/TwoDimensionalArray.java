package problems;

import java.util.Scanner;

public class TwoDimensionalArray {

    public static void main(String[] args) {
//        int a[] = {1,2,3,4};
//        int a[][] = {
//                {1,2,3},
//                {4,5,6},
//                {6,7,8}
//        };
//
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.print(a[i][j]);
//            }
//            System.out.println();
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int row = sc.nextInt();
        System.out.println("Enter no of columns");
        int col = sc.nextInt();

        int a[][] = new int[row][col];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("Enter for " + i + ", " + j + ": ");
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
