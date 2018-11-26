package com.kluke.examples.datastructures;

public class StackImpl {

  public static void main(String[] args) {
    Stack stack = new Stack(10)
        .push(2)
        .push(5)
        .push(65)
        .push(21)
        .push(343);

    System.out.println(stack.pop() + " should be 343");
    System.out.println(stack.pop() + " should be 21");
    System.out.println(stack.peek() + " should be 65");
    System.out.println(stack.peek() + " should be 65");
  }
}
