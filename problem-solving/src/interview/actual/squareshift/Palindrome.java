package interview.actual.squareshift;

import java.util.ArrayList;


// Practise
//Bharathi Kanna
//9:46 AM
//Given a string s, return true if the s can be palindrome after deleting at most one character from it.
//Example 1:
//Input: s = "aba"
//Output: true
//Example 2:
//Input: s = "abca"
//Output: true
//Explanation: You could delete the character 'c'.
//Example 3:
//Input: s = "abc"
//Output: false

public class Palindrome {
    public static void main(String[] args) {
//        String str = "abca";
//        String arr = new String(4);
//        for (int i = 0; i < str.length(); i++) {
//            arr.add(str.charAt(i));
//            for (int j = 0; j < str.length(); j++) {
//
//            }
//        }

//        int[] nums = {2, 7, 11, 15};
//        int target = 13;
//
//        for (int i = 0; i < nums.length; i++) {
//            int result = 0;
//            for (int j = 0; j < nums.length; j++) {
//                if(i != j) {
//                    result = add(nums[i], nums[j]);
//                    if(result == target) {
//                        System.out.println("Array index: " + "[" + i + ", " + j + "]");
//                    }
//                }
//            }
//        }

        int[] temperatures = {73,74,75,71,69,72,76,73};
//        Output: [1,1,4,2,1,1,0,0]

        ArrayList<Integer> op = new ArrayList(temperatures.length);
        int counter = 0;
        for (int i = 0; i < temperatures.length; i++) {
            for (int j = 0; j < temperatures.length; j++) {
                if (i != j) {
                    boolean isHigherTemperature = checkHigherTemperature(temperatures[i], temperatures[j]);
                    if (isHigherTemperature) {
                        int indexOfDays = ++counter;
                        op.add(indexOfDays);
                        counter = 0;
                        break;
                    }
                }
            }
        }
        System.out.println("Output : " + op);

    }

//    public static int add(int a, int b) {
//        return a + b;
//    }

    public static boolean checkHigherTemperature(int a, int b) {
        return b > a;
    }
}
