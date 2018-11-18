package com.kluke.examples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class SolutionClimbingLeaderboard {

    public static void main(String[] args) {
        int[] scores = {100, 90, 90, 80, 75, 60};
        int[] alice = {50, 65, 77, 90, 102};
        int[] result = {6, 5, 4, 2, 1};

        int[] scoresanother = {100,100,50,40,40,20,10};
        int[] aliceanother = {5,25,50,120};
        int[] resultanother = {6,4,2,1};

        for (int i : climbingLeaderboard(scores, alice)) {
            System.out.println(i);
        }

        for (int i : climbingLeaderboard(scoresanother, aliceanother)) {
            System.out.println(i);
        }
    }

    // Complete the climbingLeaderboard function below.
    private static int[] climbingLeaderboard(int[] scores, int[] alice) {

        int[] result = new int[alice.length];
        for (int x = 0; x < alice.length; x++) {
            result[x] = insert(Arrays.stream(scores).distinct().toArray(), alice[x]);
        }
        return result;
    }


    private static int insert(int[] sortedArray, int integer) {
        if (integer > sortedArray[0]) {
            return 1;
        }
        int x;
        for (x = 1; x < sortedArray.length; x++) {
            if (sortedArray[x] == integer) {
                return x + 1; // If Alice's score is the same as a score already on the scoreboard, return that score index.
            }
            if (sortedArray[x] < integer) {
                return x + 1;
            }
        }

//        Arrays.binarySearch()
        return x + 1; // Alice is in last place :(
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
