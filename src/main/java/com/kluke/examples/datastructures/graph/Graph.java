package com.kluke.examples.datastructures.graph;

import java.util.*;

public class Graph {

  private final int            MAX_VERTS = 20;
  private       Vertex         vertexList[];
  private       int            adjMat[][];
  private       int            nVerts;
  private       Stack<Integer> theStack;
  private       Queue<Integer> theQueue;

  public Graph() {
    vertexList = new Vertex[MAX_VERTS];
    adjMat = new int[MAX_VERTS][MAX_VERTS];
    nVerts = 0;


    // Could also use Arrays.fill();
    for (int x = 0; x < MAX_VERTS; x++) {
      for (int y = 0; y < MAX_VERTS; y++) {
        adjMat[x][y] = 0;
      }
    }

    theStack = new Stack<>();
//    theQueue = new Queue(20);
    theQueue = new ArrayDeque<>();
  }

  public Graph addVertex(char lab) {
    vertexList[nVerts++] = new Vertex(lab);
    return this;
  }

  public Graph addEdge(int start, int end) {
    adjMat[start][end] = 1;
    adjMat[end][start] = 1;
    return this;
  }

  public void displayVertex(int v) {
    System.out.print(vertexList[v].label);
  }

  public void dfs() {
    vertexList[0].wasVisited = true;
    displayVertex(0);
    theStack.push(0);

    while (!theStack.isEmpty()) {
      int v = getAdjacentUnvisitedVertex(theStack.peek());
      if (v == -1) {
        theStack.pop();
      } else {
        vertexList[v].wasVisited = true;
        displayVertex(v);
        theStack.push(v);
      }
    }

    for (int x = 0; x < nVerts; x++) {
      vertexList[x].wasVisited = false;
    }
  }

  private int getAdjacentUnvisitedVertex(int v) {
    for (int x = 0; x < nVerts; x++) {
      if (adjMat[v][x] == 1 && !vertexList[x].wasVisited) {
        return x;
      }
    }
    return -1;
  }

  public void bfs() {
    vertexList[0].wasVisited = true;
    displayVertex(0);
    theQueue.add(0);

    int v2;

    while (!theQueue.isEmpty()) {
      int v1 = theQueue.remove();
      while ((v2 = getAdjacentUnvisitedVertex(v1)) != -1) {
        vertexList[v2].wasVisited = true;
        displayVertex(v2);
        theQueue.add(v2);
      }
    }

    for (int x = 0; x < nVerts; x++) {
      vertexList[x].wasVisited = false;
    }
  }

  public void mst() {
    vertexList[0].wasVisited = true;
    theStack.push(0);

    while (!theStack.isEmpty()) {
      int currentVertex = theStack.peek();
      int v             = getAdjacentUnvisitedVertex(currentVertex);
      if (v == -1) {
        theStack.pop();
      } else {
        vertexList[v].wasVisited = true;
        theStack.push(v);

        displayVertex(currentVertex);
        displayVertex(v);
        System.out.print(" ");
      }
    }

    for (int x = 0; x < nVerts; x++) {
      vertexList[x].wasVisited = false;
    }
  }
}
