package com.kluke.examples.datastructures.graph;

class Vertex {
  char label;
  boolean wasVisited;
  
  Vertex(char lab) {
    this.label = lab;
    this.wasVisited = false;
  }
}
