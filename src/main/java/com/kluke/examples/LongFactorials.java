package com.kluke.examples;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LongFactorials {

  // Complete the extraLongFactorials function below.
  static void extraLongFactorials(int n) {


  }

  public static void main(String[] args) {
    final BigInteger bigInteger = BigInteger.valueOf(25);
    System.out.println(factorial(bigInteger));
  }
  
  
  /*
  5! = 5*4*3*2*1
   */
  
  private static BigInteger factorial(BigInteger number) {
    if (number.equals(BigInteger.ZERO) || number.equals(BigInteger.ONE)) {
      return BigInteger.ONE;
    } else {
      return factorial(number.subtract(BigInteger.ONE)).multiply(number);
    }
  }
}
