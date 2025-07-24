package functionalProgramming.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperation {
    public static void main(String[] args) {
//        // 1
//        // forEach() - performs an action on each element
//        List<String> names = Arrays.asList("Kishore", "Kalai", "Madhan");
//        names.stream().forEach(System.out::println);

//        // 2
//        // collect() - collects elements into a collection like a list or set
//        List<Integer> numbers = Arrays.asList(1, 4, 5, 7);
//        List<Integer> collectedNumbers = numbers.stream().collect(Collectors.toList());
//        System.out.println(collectedNumbers);

//        // 3
//        // count() - returns the number of elements in the stream
//        List<Integer> numbers = Arrays.asList(1, 4, 5, 7, 9, 8, 66, 45);
//        long count = numbers.stream().count();
//        System.out.println(count);

        // 4
        // reduce() - combine elements into a single value
        List<Integer> numbers = Arrays.asList(1, 4, 5, 7);
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
