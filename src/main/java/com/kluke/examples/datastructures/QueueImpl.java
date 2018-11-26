package com.kluke.examples.datastructures;

public class QueueImpl {

  public static void main(String[] args) {
    Queue queue = new Queue(5)
        .insert(2)
        .insert(4)
        .insert(1)
        .insert(8);

    System.out.println(queue.size() + " Size of queue");
    
    while (!queue.isEmpty()) {
      System.out.println(queue.remove() + " Removed from queue.");
    }
    
    queue
        .insert(5)
        .insert(224)
        .insert(54)
        .insert(79)
        .insert(42);

    System.out.println(queue.remove() + " Removing item");
    queue.insert(5);
  }
}
