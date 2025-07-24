package concept.string;

import java.util.Scanner;

//Ex: Programming
//Output: r, g, m
//Run the program:
//Enter String:
//Programming
//r g m

public class PrintDuplicate {
    public static String printDuplicateChar(String str) {
        String result="";
        for(int i=0;i<str.length();i++) {
            int count=0;
            if(str.charAt(i)!=' ') {
                for(int j=i+1;j<str.length();j++) {
                    if(str.charAt(i)==str.charAt(j) &&(i!=j)) {
                        count++;
                    }
                }
                if(count==1) {
                    result += str.charAt(i)+" ";
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();
        System.out.println(printDuplicateChar(str));
        sc.close();
    }

}
