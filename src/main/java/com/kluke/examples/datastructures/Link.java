package com.kluke.examples.datastructures;

public class Link {
  
  Link link;
  int data;

  Link(int data) {
    this.data = data;
  }

  void displayLink() {
    System.out.println("Data: " + data);
  }
}
