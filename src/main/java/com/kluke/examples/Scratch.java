package com.kluke.examples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Scratch {

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(new BinarySearchExample(test).find(3));
    }

    private static void test(int[][] multiArray) {
        Stream<Integer> test = Arrays
                .stream(multiArray)
                .flatMapToInt(Arrays::stream)
                .boxed();

        final Set<Integer> distinct = new HashSet<>();
        final Set<Integer> duplicate = new HashSet<>();

        test.forEach((integer) -> {
            if (!distinct.add(integer)) {
                duplicate.add(integer);
            }
        });

        System.out.println(distinct);
        System.out.println(duplicate);
    }
}
