package com.kluke.examples;

import java.io.IOException;
import java.util.Scanner;

public class SolutionCountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int count = 0;
        String lastCount;
        int valleys = 0;
        for (String string : s.split("")) {
            if (string.equals("U")) {
                count++;
                lastCount = string;
            } else {
                count--;
                lastCount = string;
            }
            if (count == 0 && lastCount.equals("U")) {
                valleys++;
            }
        }
        return valleys;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(SolutionCountingValleys.countingValleys(10, "UUDDUDDDUU"));
    }
}