package questionLevel.basic;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5};
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        System.out.println(set);
    }
}

class RemoveWhitespaces {
    public static void main(String[] args) {
        String str = "A u t o m a t i o n";
        String result = str.replaceAll("\\s+" , "");
        System.out.println(result);
    }
}
