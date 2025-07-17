package problems;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int a[][] = {
                {1,2,3},
                {4,5,6},
                {8,8,9}
        };

        int pd = 0;
        int sd = 0;

        System.out.println("Matrix diagonal sum:");
        for(int i = 0; i < a.length; i++) { // 0,1,2
            for (int j = 0; j < a[0].length; j++) { // 0,1,2
                if (i == j) pd = pd + a[i][j];
                if ( (i + j) == a.length-1) sd = sd + a[i][j];
            }
        }
        System.out.println(pd);
        System.out.println(sd);
    }
}
