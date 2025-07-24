package concept.string;

import java.util.*;

// Ex: Nacre
// op: ercaN
public class Reverse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to reverse: ");
        String str=sc.nextLine();
        StringBuilder sb= new StringBuilder();
        sb.append(str);
        sb.reverse();
        System.out.println(sb);
        sc.close();
    }

}
