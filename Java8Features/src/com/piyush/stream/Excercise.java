package com.piyush.stream;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

// Predicate, Consumer, Function, Supplier
// Stream API
// stream ------> DAM
// forEach ------> Consumer

public class Excercise {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Traditional for-each loop
        // for (Integer x : numbers) {
        //     System.out.println(x);
        // }

        Stream<Integer> streamOfNumbers = numbers.stream();

        Consumer<Integer> c = i -> System.out.println(i);

        streamOfNumbers.forEach(c);
    }
}
