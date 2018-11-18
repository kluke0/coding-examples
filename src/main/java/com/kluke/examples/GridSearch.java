package com.kluke.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GridSearch {

  static String[] testCase1 = {
      "7283455864",
      "6731158619",
      "8988242643",
      "3830589324",
      "2229505813",
      "5633845374",
      "6473530293",
      "7053106601",
      "0834282956",
      "4607924137"};
  static String[] findMe    = {
      "9505",
      "3845",
      "3530"};

  static String[] testCase2 = {
      "123412",
      "561212",
      "123634",
      "781288"};
  static String[] findMe2   = {
      "12",
      "34"};
  static String   result    = "YES";

  static String[] testCase3 = {
      "123456",
      "567890",
      "234567",
      "194729"
  };

  static String[] findMe3   = {
      "1234",
      "5678",
      "2345",
      "4729"
  };
  static String[] testCase4 = {
      "456712",
      "561245",
      "123667",
      "781288"
  };
  static String[] findMe4   = {
      "45",
      "67"
  };
  static String[] testCase5 = {
      "111111111111111",
      "111111111111111",
      "111111111111111",
      "111111011111111",
      "111111111111111",
      "111111111111111",
      "101010101010101"
  };
  static String[] findMe5 = {
      "11111",
      "11111",
      "11111",
      "11110"
  };
  final  String   result3   = "NO";
  final  String   result4   = "YES";
  final  String   result5 = "YES";


  public static void main(String[] args) {


//    System.out.println("==============");
//    System.out.println(gridSearch2(testCase3, findMe3));
//    System.out.println("==============");
//    System.out.println(gridSearch2(testCase4, findMe4));
//    System.out.println("==============");
//    System.out.println(gridSearch2(testCase5, findMe5));
    
    gridSearch3(testCase4, findMe4);
  }


  static String gridSearch(String[] testCase, String[] findMe) {
    for (int row = 0; row < testCase.length - findMe.length + 1; row++) {

      System.out.println("-----");

      for (int x = 0; x < findMe.length; x++) {
        System.out.println("Find me: " + findMe[x] + " First loop: " + testCase[x + row]);
        char[] testCaseChar = testCase[x + row].toCharArray();

        System.out.println(testCaseChar[1]);

      }
    }

    return "";
  }

  static String gridSearch2(String[] testCase, String[] findMe) {

    
    for (int row = 0; row < testCase.length - findMe.length + 1; row++) {

      for (int charLength = 0; charLength < testCase[row].toCharArray().length; charLength++) {
        System.out.println("-----");
        
        for (int x = 0; x < findMe.length; x++) {
          System.out.println("Find me: " + findMe[x] + " First loop: " + testCase[x + row]);
          char[] testCaseChar = testCase[x + row].toCharArray();

          System.out.println(testCaseChar[charLength] + " find me " + findMe[charLength]);
          
        }
      }


    }
    
    
    
    
    return "";
  }
  
  static void gridSearch3(String[] testCase, String[] findMe) {
    List<char[]> testCaseChars = Arrays
        .stream(testCase)
        .map(String::toCharArray)
        .collect(Collectors.toList());
    
    Arrays
        .stream(findMe)
        .forEach(character -> System.out.println(character));
    
//    Map<Integer, String> matches = new HashMap<>();
//    testCaseChars
//        .forEach(character-> System.out.println(character.toString()));
//    
  }
}
