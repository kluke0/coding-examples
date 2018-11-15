package com.kluke.examples;

import java.util.*;
import java.util.stream.IntStream;

public class MagicSquare {
    public static void main(String[] args) {
        int[][] arr = {{5, 3, 4}, {1, 5, 8}, {6, 4, 2}};
        System.out.println(solution(arr));
    }

    private static int solution(int[][] inputArray) {
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
}
