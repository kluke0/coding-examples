package com.kluke.examples;

public class FizzBuzz {

  public static void main(String[] args) {
    for (int i = 1; i <= 1000; i++) {

      if (i % 5 == 0) {
        System.out.println("div by 5");
        System.out.println(i);
      }
      if (i % 3 == 0) {
        System.out.println("div by 3");
        System.out.println(i);
      }
    }
  }

}
