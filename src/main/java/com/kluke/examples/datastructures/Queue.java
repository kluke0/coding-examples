package com.kluke.examples.datastructures;

public class Queue {
  
  private int front, rear;
  private int[] theQueue;
  private int numberOfItems;
  private int maxSize;

  public Queue(int maxSize) {
    this.maxSize = maxSize;
    this.theQueue = new int[this.maxSize];
    this.front = 0;
    this.rear = -1;
    this.numberOfItems = 0;
  }
  
  public Queue insert(int x) {
    if (rear == (maxSize - 1)) {
      rear = -1;
    }
    numberOfItems++;
    theQueue[++rear] = x;
    return this;
  }
  
  public int remove() {
    int temp = theQueue[front++];
    if (front == maxSize) {
      front = 0;
    }
    numberOfItems--;
    return temp;
  }
  
  public int peekFront() {
    return theQueue[front];
  }
  
  public boolean isEmpty() {
    return (numberOfItems == 0);
  }
  
  public boolean isFull() {
    return (numberOfItems == maxSize);
  }
  
  public int size() {
    return numberOfItems;
  }
}
