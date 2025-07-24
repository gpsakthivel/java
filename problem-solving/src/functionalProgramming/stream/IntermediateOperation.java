package functionalProgramming.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperation {
    public static void main(String[] args) {
//        // 1
//        // filter() - filters elements based on the conditions
//        List<String> names = Arrays.asList("adam", "eve", "romeo");
//        List<String> filterNames = names.stream().filter(name -> name.startsWith("e")).collect(Collectors.toList());
//        System.out.println(filterNames);

//        // 2
//        // map() - transform each element in the stream
//        List<String> listNames = Arrays.asList("adam", "eve", "romeo");
//        List<String> upperCaseNames = listNames.stream().map(String::toUpperCase).collect(Collectors.toList());
//        System.out.println();
//        System.out.println(upperCaseNames);

//        // 3
//        // sorted() - sorts elements in natural order or using comparator
//        List<Integer> numbers = Arrays.asList(2, 5, 6, 88, 5);
//        List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
//        System.out.println(sortedNumbers);

        // 4
        // distinct() - to remove duplicate elements from the stream
        List<Integer> numbers = Arrays.asList(2, 5, 6, 88, 5);
        List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctNumbers);
    }
}
