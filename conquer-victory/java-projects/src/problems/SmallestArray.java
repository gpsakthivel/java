package problems;

import java.util.Scanner;

public class SmallestArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter array elements");
        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int min = a[0];
        for(int i=1; i < a.length; i++) {
            if(a[i] < min) min = a[i];
        }

        System.out.println("Smallest element : " + min);
    }
}
