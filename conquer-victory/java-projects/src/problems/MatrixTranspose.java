package problems;

public class MatrixTranspose {
    public static void main(String[] args) {
        int a[][] = {
                {1,2,3},
                {4,5,6}
        };

        int c[][] = new int[a[0].length][a.length];

        System.out.println("Transpose of matrix:");
        for(int i = 0; i < a[0].length; i++) { // 0,1,2
            for (int j = 0; j < a.length; j++) { // 0,1
                c[i][j] = a[j][i];
                // c[0][1] == c[1][0]
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
