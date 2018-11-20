package com.kluke.examples.algorithm;

import java.util.Arrays;

public class Hashing {
    static String[] array = {"Kevin", "Scott", "Luke", "Sam", "Sarah", "Ali", "Alexander", "Jim", "Lo"};

    public static void main(String[] args) {
        int[] newArray = new int[31];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = hashFunction(array[i]);
        }
        System.out.println(Arrays.toString(newArray));
    }

    static int hashFunction(String string) {
        int total = 0;
        for (char character : string.toCharArray()) {
            total += (int) character;
        }
        return total >>> 2;
    }
}
