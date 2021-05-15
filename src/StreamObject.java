import javafx.beans.binding.ObjectExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        // Stream API - collection process
        // Collection - group of objects

        List<Integer> li1 = Arrays.asList(8,7,1,21,4,45,6);
        // 1 - blank Stream
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(e -> System.out.println(e));

        // 2- Array object , collection
        String[] name = {"Arpit", "Amit", "Rakesh"};
        Stream<String> stream1 = Stream.of(name);
        stream1.forEach(e -> System.out.println(e));

        // 3 - builder Pattern
        Stream<Object> streamBuilder = Stream.builder().build();
        System.out.println("builder form");
        //streamBuilder.forEach(a-> System.out.println(a));
        // 4- Anonymous array
        IntStream stream = Arrays.stream(new int[]{1, 2, 34, 5, 4564, 4});
        //stream.forEach(e -> System.out.println(e));

        // 5  List , Set
        Stream<Integer> stream2 = li1.stream();
    }
}