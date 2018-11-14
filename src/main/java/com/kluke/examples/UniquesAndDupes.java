package com.kluke.examples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniquesAndDupes {
  
  public static void main(String[] args) {
    int[] array = {5, 5, 2, 15, 54, 520, 4, 2, 7, 9, 12};
    printUniquesAndDuplicatesFromArray(array);
    printUniquesFromArray(array);
  }
  
  private static void printUniquesAndDuplicatesFromArray(int[] array) {
    final Set<Integer> uniques = new HashSet<>();
    final Set<Integer> duplicates = new HashSet<>();
    Arrays
        .stream(array)
        .forEach((e) -> {
          if (!uniques.add(e)) {
            duplicates.add(e);
          }
        });

    System.out.println(uniques);
    System.out.println(duplicates);
  }

  private static void printArray(Integer[] intArray) {
    System.out.println(Arrays.asList(intArray));
  }
  
  private static Integer[] convertArrayPrimitiveToArrayObject(int[] array) {
    return Arrays
        .stream(array)
        .boxed()
        .toArray(Integer[]::new);
  }
  
  private static void printUniquesFromArray(int[] array) {
    Set<Integer> setInt = new HashSet<>(Arrays.asList(convertArrayPrimitiveToArrayObject(array))); // Uniques
    System.out.println(setInt);
  }
}
