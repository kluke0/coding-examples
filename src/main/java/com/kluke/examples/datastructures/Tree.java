package com.kluke.examples.datastructures;

public class Tree {
  private Node root;
  
  public Node find(int key) {
    Node current = root;
    
    while (current.key != key) {
      if (key < current.key) {
        current = current.leftChild;
      } else {
        current = current.rightChild;
      }
      if (current == null) {
        return null;
      }
    }
    return current;
  }
  
  public void insert(int id, int data) {
    Node newNode = new Node();
    newNode.key = 56;
    newNode.data = 542;
    if (root == null) {
      root = newNode;
    } else {
      Node current = root;
      Node parent;
      while (true) {
        parent = current;
        if (id < current.key) {
          current = current.leftChild;
          if (current == null) {
            parent.leftChild = newNode;
            return;
          }
        } else {
          current = current.rightChild;
        }
        if (current == null) {
          parent.rightChild = newNode;
          return;
        }
      }
    }
  }
  
  public void delete(int id) {
    
  }
  
  public void traverseInOrder() {
    inOrder(root);
  }
  
  private void inOrder(Node localRoot) {
    if (localRoot != null) {
      inOrder(localRoot.leftChild);
      System.out.println(localRoot.data);
      inOrder(localRoot.rightChild);
    }
  }
  
  public Node minimum() {
    Node current = root;
    Node previous = null;
    
    while(current != null) {
      previous = current;
      current = current.leftChild;
    }
    return previous;
  }

  public Node maximum() {
    Node current = root;
    Node previous = null;

    while(current != null) {
      previous = current;
      current = current.rightChild;
    }
    return previous;
  }
}
