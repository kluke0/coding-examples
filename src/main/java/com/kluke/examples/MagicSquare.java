package com.kluke.examples;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MagicSquare {
    public static void main(String[] args) {
        int[][] arr = {{5, 3, 4}, {1, 5, 8}, {6, 4, 2}};
        System.out.println(solution1(arr));
    }

    static int solution1(int[][] inputArray) {
        int[] flatArray = Arrays
                .stream(inputArray)
                .flatMapToInt(IntStream::of)
                .toArray();
      int[][] solutions =
       {{8, 1, 6, 3, 5, 7, 4, 9, 2},
        {6, 1, 8, 7, 5, 3, 2, 9, 4},
        {4, 9, 2, 3, 5, 7, 8, 1, 6},
        {2, 9, 4, 7, 5, 3, 6, 1, 8},
        {8, 3, 4, 1, 5, 9, 6, 7, 2},
        {4, 3, 8, 9, 5, 1, 2, 7, 6},
        {6, 7, 2, 1, 5, 9, 8, 3, 4},
        {2, 7, 6, 9, 5, 1, 4, 3, 8}};

      int[] steps = new int[solutions.length];

      for (int x = 0; x < solutions.length; x++) {
          int sum = IntStream.of(subtractArrays(flatArray, solutions[x])).sum();
          steps[x] = sum;
      }
      return IntStream.of(steps).min().getAsInt();
    }

    private static int[] subtractArrays(int[] array1, int[] array2) {
        int[] array3 = new int[Math.min(array1.length, array2.length)];

        for (int i = 0; i < array3.length; i++) {
            array3[i] = Math.abs(array1[i] - array2[i]);
        }
        return array3;
    }

    static int solution2DoesntWork(int[][] multiArray) {
        final Stream<Integer> test = Arrays
                .stream(multiArray)
                .flatMapToInt(Arrays::stream)
                .boxed();

        final Set<Integer> missing = new HashSet<>();
        final Set<Integer> distinct = new HashSet<>();
        final Set<Integer> duplicate = new HashSet<>();

        test.forEach((integer) -> {
            if (!distinct.add(integer)) {
                duplicate.add(integer);
            }
        });

        for (int i = 1; i <= 9; i++) {
            if (distinct.add(i)) {
                missing.add(i);
            }
        }

        int[] differenceArray = new int[Math.min(missing.toArray().length, duplicate.toArray().length)];
        int[] missingArray = missing.stream().mapToInt(x->x).toArray();
        int[] duplicateArray = duplicate.stream().mapToInt(x->x).toArray();

        for (int i = 0; i < differenceArray.length; i++) {
            differenceArray[i] = Math.abs(missingArray[i] - duplicateArray[i]);
        }
        return IntStream.of(differenceArray).sum();
    }
}
