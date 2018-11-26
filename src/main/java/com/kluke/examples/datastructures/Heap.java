package com.kluke.examples.datastructures;

public class Heap {
  
  private int maxSize;
  private int currentSize;
  private Node[] heapArray;
  
  public Heap(int max) {
    this.maxSize = max;
    this.currentSize = 0;
    this.heapArray = new Node[maxSize];
  }

  /**
   * Tree as an array:
   * 
   * Parent is: (x - 1) / 2
   * 
   * Left Child is: 2 * x + 1
   * 
   * Right Child is: 2 * x + 2
   * 
   */

  public boolean insert(int key) {
    if (currentSize == maxSize) {
      return false;
    }
    Node newNode = new Node(key);
    heapArray[currentSize] = newNode;
    trickleUp(currentSize++);
    return true;
  }
  
  private void trickleUp(int index) {
    int parent = (index - 1) / 2;
    Node bottom = heapArray[index];
    
    while (index > 0 && heapArray[parent].key < bottom.key) {
      index = parent;
      parent = (parent - 1) / 2;
    }
    heapArray[index] = bottom;
  }
  
  public Node remove() {
    Node root = heapArray[0];
    heapArray[0] = heapArray[--currentSize];
    trickleDown(0);
    return root;
  }
  
  private void trickleDown(int index) {
    int largerChild;
    Node top = heapArray[index];
    while (index < currentSize / 2) {
      int leftChild = 2 * index  + 1;
      int rightChild = leftChild  + 1;
      
      if (rightChild < currentSize && heapArray[leftChild].key < heapArray[rightChild].key) {
        largerChild = rightChild;
      } else {
        largerChild = leftChild;
      }
      
      if (top.key >= heapArray[largerChild].key) {
        break;
      }
      
      heapArray[index] = heapArray[largerChild];
      index = largerChild;
    }
    heapArray[index] = top;
  }
  
  public boolean change(int index, int newValue) {
    if (index < 0 || index >= currentSize) {
      return false;
    }

    int oldValue = heapArray[index].key;
    heapArray[index].key = newValue;

    if (oldValue < newValue) {
      trickleUp(index);
    } else {
      trickleDown(index);
    }
    return true;
  }
}
