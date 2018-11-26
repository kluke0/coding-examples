package com.kluke.examples.datastructures.graph;

public class GraphImpl {

  /**
   * 
   * 
   *    B----C
   *   /
   *  /
   * A
   * \
   *  \
   *   D----E
   * 
   *  A B C D E
   * A0 1   1
   * B  0 1
   * C    0
   * D      0 1
   * E        0
   * 
   */
  public static void main(String[] args) {
    Graph theGraph = new Graph()
        .addVertex('A')
        .addVertex('B')
        .addVertex('C')
        .addVertex('D')
        .addVertex('E')
        .addEdge(0, 1) // AB
        .addEdge(1, 2) // BC
        .addEdge(0, 3) // AD
        .addEdge(3, 4);// DE

    System.out.println("Visits: ");
    theGraph.dfs();
    System.out.println();
    System.out.println();
    System.out.println("=======");
    System.out.println();
    System.out.println("Visits: ");
    theGraph.bfs();
  }
}
