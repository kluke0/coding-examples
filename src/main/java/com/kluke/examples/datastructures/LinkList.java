package com.kluke.examples.datastructures;

public class LinkList {
  
  private Link first;
  
  LinkList() {
    this.first = null;
  }
  
  boolean isEmpty() {
    return (first==null);
  }
  
  LinkList insertFirst(int data) {
    Link newLink = new Link(data);
    newLink.link = first;
    first = newLink;
    return this;
  }
  
  Link deleteFirst() {
    Link temp = first;
    first = first.link;
    return temp;
  }
  
  void displayList() {
    Link current = first;
    
    while (current != null) {
      current.displayLink();
      current = current.link;
    }
  }
  
  Link find(int key) {
    Link current = first;
    while (current.data != key) {
      if (current.link == null) {
        return null;
      } else {
        current = current.link;
      }
    }
    return current;
  }
  
  Link delete(int key) {
    Link current = first;
    Link previous = first;
    while (current.data != key) {
      if (current.link == null) {
        return null;
      } else {
        previous = current;
        current = current.link;
      }
    }
    if (current == first) {
      first = first.link;
    } else {
      previous.link = current.link;
    }
    return current;
  }
}
