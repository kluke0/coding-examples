package com.kluke.examples;

import java.util.Arrays;

public class ThreeD {

  static int[][] array = {
      {3, 5, 2},
      {7, 1, 0},
      {0, 4, 4},
  };

  static int[][] arrayTest = {
      {5, 3, 7, 5},
      {7, 1, 0, 1},
      {0, 4, 4, 0},
      {2, 6, 0, 8},
  };   

  public static void main(String[] args) {
    System.out.println(compare(arrayTest));
  }
  

  static int compare(int[][] array) {
    int grandTotal = 0;
    int arrayDimensions = array.length * array[array.length - 1].length;
    
    for (int outer = 0; outer < array.length; outer++) {
      
      
      for (int inner = 0; inner < array[outer].length; inner++) {
        
        if (array[outer][inner] == 0) {
          arrayDimensions--;
        }
      }
      
      int inner = 0;
      int total = array[outer][inner];
      System.out.println(total + " total before for loop, plus index that should be the first number " + array[outer][inner]);
      for (;inner < array[outer].length - 1; inner++) {
        int difference = Math.abs(array[outer][inner] - array[outer][inner + 1]);
        System.out.println(difference + " difference in loop");
        total = total + difference;
      }
      
      total = total + array[outer][inner];
      System.out.println(total + " total after loop, plus index that was added " + array[outer][inner]);
      
      int down = 0;
      int downTotal = array[down][outer];
      System.out.println(downTotal + " downTotal before for loop, plus index that should be the first number " + array[down][outer]);
      for (; down < array[down].length - 1; down++) {
        int difference = Math.abs(array[down][outer] - array[down + 1][outer]);
        System.out.println(difference + " difference in DOWN loop");
        downTotal = downTotal + difference;
      }
      downTotal = downTotal + array[down][outer];

      System.out.println(downTotal + " Down total");

      System.out.println(arrayDimensions + " Array dimensions");
      
      grandTotal = grandTotal + total + downTotal;
    }
    return grandTotal + (arrayDimensions * 2);
  }

  static void count(int[][] array) {
    int[] maxes   = new int[array.length];
    int[] lengths = new int[array.length];

    int max    = 0;                // Sides
    int length = array.length;     // Top and bottom

    for (int outer = 0; outer < array.length; outer++) {
      for (int inner = 0; inner < array[outer].length; inner++) {

        if (array[outer][inner] > max) {
          max = array[outer][inner];
        }

        if (array[outer][inner] == 0) {
          length--;
        }
      }
      maxes[outer] = max * 2;         // Add max to the max array
      max = 0;                        // Then reset max for next iteration
      lengths[outer] = length * 2;    // Add length to the lengths array
      length = array.length;          // Then reset array length
    }
    System.out.println("Maxes Total");
    System.out.println(Arrays.toString(maxes));
    System.out.println("Lengths Total");
    System.out.println(Arrays.toString(lengths));
  }
}
