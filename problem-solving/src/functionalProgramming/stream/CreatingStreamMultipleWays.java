package functionalProgramming.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatingStreamMultipleWays {
    public static void main(String[] args) {
//        // 1
//        // from collections (list, set, map)
//        // collections in java have a stream() method
//
//        List<String> names = Arrays.asList("Adam", "Eve", "Madhan");
//        Stream<String> nameStream = names.stream();
//        nameStream.forEach(System.out::println);
//        // or
//        names.stream().forEach(System.out::println);

//        // 2
//        // from arrays
//        // Arrays.stream() to create a stream from an array
//        int[] numbers = { 2, 4, 56, 76, 9};
//        IntStream numberStream = Arrays.stream(numbers);
//        numberStream.forEach(System.out::println);

//        // 3
//        // using Stream.of()
//        // Stream.of() creates a stream from individual elements or an array
//        Stream<String> fruitStream = Stream.of("Apple", "Banana", "Cherry");
//        fruitStream.forEach(System.out::println);

//        // 4
//        // generating streams
//        // Stream.generate() - to create an infinite stream of values
//        Stream<String> helloStream = Stream.generate(() -> "Hello").limit(3);
//        helloStream.forEach(System.out::println);

//        // 5
//        // creating a streams with Stream.iterate()
//        // Example: generating numbers starting from 5
//        Stream<Integer> numStream = Stream.iterate(3, n -> n + 1).limit(5);
//        numStream.forEach(System.out::println);

    }
}
