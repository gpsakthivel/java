package problems;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter no of rows1");
//        int row1 = sc.nextInt();
//        System.out.println("Enter no of columns1");
//        int col1 = sc.nextInt();
//
//        System.out.println("Enter no of rows2");
//        int row2 = sc.nextInt();
//        System.out.println("Enter no of columns2");
//        int col2 = sc.nextInt();

//        int a[][] = new int[row1][col1];
//        int b[][] = new int[row2][col2];
//        int c[][] = new int[a.length][b[0].length];
//
//        System.out.println("Enter matrix 1 elements: ");
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.print("Enter for " + i + ", " + j + ": ");
//                a[i][j] = sc.nextInt();
//            }
//        }
//
//        System.out.println("Enter matrix 2 elements: ");
//        for (int i = 0; i < b.length; i++) {
//            for (int j = 0; j < b[i].length; j++) {
//                System.out.print("Enter for " + i + ", " + j + ": ");
//                b[i][j] = sc.nextInt();
//            }
//        }

        int a[][] = {
                {1, 2},
                {3, 4}
        };
        int b[][] = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int c[][] = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for(int k = 0; k < a[0].length; k++) {
                    c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
                }
            }
        }

        System.out.println("Resultant matrix: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
