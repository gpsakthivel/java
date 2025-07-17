package onlinevideos;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // age
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Age : " + age);
        // temp
        System.out.println("Enter your temp:");
        double temp = sc.nextDouble();
        System.out.println("Temp : " + temp);
        // name
        System.out.println("Enter your name:");
        String name = sc.next();
        System.out.println("Name : " + name);
        // to get a character
        System.out.println("Enter a character:");
        char a = sc.next().charAt(0);
        System.out.println("Age : " + a);

        // have to close the resource (scanner method)
        sc.close();
    }

}
