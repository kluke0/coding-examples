package com.kluke.examples.algorithm;

import java.util.Arrays;

public class SelectSort {

    private static int[] array = {56, 63, 21, 42, 32, 6, 78, 34, 2, 4, 4};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(selectSort(array)));
    }

    static int[] selectSort(int[] array) {
        System.out.println("Before sort:");
        System.out.println(Arrays.toString(array));

        int min, in, out;

        for (out = 0; out < array.length; out++) {

            min = out;

            for (in = out + 1; in < array.length; in++) {
                if (array[in] < array[min]) {
                    int temp = array[in];
                    array[in] = array[out];
                    array[out] = temp;
                }
            }
        }
        return array;
    }
}
