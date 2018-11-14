package com.kluke.examples;

public class ArrayTest {

  private final int[] someArray;

  public ArrayTest(int[] someArray) {
    this.someArray = someArray;
  }

  public int find(int key) {
    int lowerBound = 0;
    int upperBound = someArray.length - 1;

    while (lowerBound <= upperBound) {
      int  middle      = (lowerBound + upperBound) >>> 1;
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
