package com.kluke.examples;

public class BinarySearchExample {

    private final int[] someArray;

    public BinarySearchExample(int[] someArray) {
        this.someArray = someArray;
    }

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(new BinarySearchExample(test).find(3));
    }

    public int find(int key) {
        int lowerBound = 0;
        int upperBound = someArray.length - 1;

        while (lowerBound <= upperBound) {
            int middle = (lowerBound + upperBound) >>> 1;
            long middleValue = someArray[middle];

            if (middleValue < key) {
                lowerBound = middle + 1;
            } else if (middleValue > key) {
                upperBound = middle - 1;
            } else {
                return middle; // Key found
            }
        }
        return -(lowerBound + 1); // Key not found
    }
}
