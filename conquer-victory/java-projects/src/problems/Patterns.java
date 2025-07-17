package problems;

public class Patterns {
    public static void main(String[] args) {
//          0123
//        0 ****
//        1 ****
//        2 ****
//        3 ****
//        for (int i=0;i<4;i++) {
//            for (int j=0;j<4;j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//          0123
//        0 ****
//        1 *  *
//        2 *  *
//        3 ****
//        int row = 5;
//        int col = 5;
//        for (int i=0; i<row ;i++) {
//            for (int j=0; j<col ;j++) {
//                if (i==0 || i== row-1 || j==0 || j==row-1) System.out.print("*");
//                else System.out.print(" ");
//            }
//            System.out.println();
//        }


//          0123
//        0 *
//        1 **
//        2 ***
//        3 ****
//        int row = 4;
//        for (int i=0; i<row ;i++) {
//            for (int j=0; j<=i ;j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//          0123
//        0 1
//        1 22
//        2 333
//        3 4444
        int row = 4;
        for (int i=1; i<=row ;i++) {
            for (int j=1; j<=i ;j++) {
                System.out.print(i + " ");
//                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
