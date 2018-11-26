package com.kluke.examples.datastructures;

public class Stack {
  
  private int maxSize;
  private int[] theStack;
  private int top;

  Stack(int maxSize) {
    this.maxSize = maxSize;
    this.theStack = new int[maxSize];
    this.top = -1;
  }
  
  Stack push(int x) {
    theStack[++top] = x;
    return this;
  }
  
  int pop() {
    return theStack[top--];
  }
  
  int peek() {
    return theStack[top];
  }
  
  boolean isEmpty() {
    return (top == -1);
  }
}
