package questionLevel.medium;

import java.util.HashMap;

public class MaxOccurrenceCharacter {
    public static void main(String[] args) {
        String str = "programming";
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        char maxChar = str.charAt(0);
        int maxCount = 0;
        for (char c : charCount.keySet()) {
            if (charCount.get(c) > maxCount) {
                maxCount = charCount.get(c);
                maxChar = c;
            }
        }

        System.out.println(maxChar);
    }
}

class CountCharacter {
    public static void main(String[] args) {
        String str = "Automation";
        char ch = 'a';
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) count++;
        }
        System.out.println(count);
    }
}