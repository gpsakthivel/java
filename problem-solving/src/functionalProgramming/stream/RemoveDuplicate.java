package functionalProgramming.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<String> listOfString = Arrays.asList("hello", "hii", "hii", "world");
        List<String> uniqueList = listOfString.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueList);
    }
}

class CountNumOfOccurrenceInString {
    public static void main(String[] args) {
        String inputString = "Hello world...";
        Map<Character, Long> freqMap = inputString.chars().mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(freqMap);
    }
}

class CountNumOfOccurrenceInList {
    public static void main(String[] args) {
        List<String> stationaryList = Arrays.asList("pen", "eraser", "pen", "box");
        Map<String, Long> freqMap = stationaryList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(freqMap);
    }
}