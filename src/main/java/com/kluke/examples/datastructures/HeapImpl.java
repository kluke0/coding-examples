package com.kluke.examples.datastructures;

public class HeapImpl {

  public static void main(String[] args) {
    Heap heap = new Heap(50);
    
    heap.insert(52);
    heap.insert(23);
    System.out.println(heap.remove().key);
  }
}
