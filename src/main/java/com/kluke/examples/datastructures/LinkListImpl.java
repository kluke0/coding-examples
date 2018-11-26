package com.kluke.examples.datastructures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LinkListImpl {


  public static void main(String[] args) {
    LinkList linkList = new LinkList()
        .insertFirst(4)
        .insertFirst(7)
        .insertFirst(234)
        .insertFirst(24);

    linkList.displayList();

    Link find = linkList.find(7);

    if (find != null) {
      System.out.println("Found " + find.data);
    } else {
      System.out.println("Cannot find!");
    }
    
    while (!linkList.isEmpty()) {
      Link aLink = linkList.deleteFirst();
      System.out.println("Deleted ");
      aLink.displayLink();
    }
    linkList.displayList();
  }
}

