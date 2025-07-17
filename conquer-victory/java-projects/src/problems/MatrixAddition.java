package problems;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows1");
        int row1 = sc.nextInt();
        System.out.println("Enter no of columns1");
        int col1 = sc.nextInt();

        System.out.println("Enter no of rows2");
        int row2 = sc.nextInt();
        System.out.println("Enter no of columns2");
        int col2 = sc.nextInt();

        if (row1 == row2 && col1 == col2) {
            int a[][] = new int[row1][row2];
            int b[][] = new int[row1][row2];
            int c[][] = new int[row1][row2];

            System.out.println("Enter matrix 1 elements: ");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    System.out.print("Enter for " + i + ", " + j + ": ");
                    a[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter matrix 2 elements: ");
            for (int i = 0; i < b.length; i++) {
                for (int j = 0; j < b[i].length; j++) {
                    System.out.print("Enter for " + i + ", " + j + ": ");
                    b[i][j] = sc.nextInt();
                }
            }

            System.out.println("Resultant matrix: ");
            for (int i = 0; i < a.length; i++) { // 0
                for (int j = 0; j < a[i].length; j++) { // 0, 1
                    c[i][j] = a[i][j] + b[i][j];
                }
            }

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Order of matrices should be same");
        }
    }
}
