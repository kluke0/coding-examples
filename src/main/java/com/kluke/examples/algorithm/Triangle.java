package com.kluke.examples.algorithm;

public class Triangle {

  public static void main(String[] args) {
//    System.out.println(triangle(1000));
    System.out.println(multiplyPower(2, 8));
  }

  static int triangle(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n + triangle(n - 1);
    }
  }
  
  static int multiplyPower(int x, int n) {
    if (n == 1) {
      return x;
    } else {
      return x * multiplyPower(x, n - 1);
    }
  }
}
