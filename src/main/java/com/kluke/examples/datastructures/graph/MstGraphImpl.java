package com.kluke.examples.datastructures.graph;

public class MstGraphImpl {

  /**
   * A also connects to D and E.
   * 
   *      A
   *    /  \
   *   B----C
   *   |\  /|
   *   | \/ |
   *   | /\ |
   *   |/  \|
   *   D----E
   * 
   * 
   *   A B C D E 
   * A 0 1 1 1 1
   * B   0 1 1 1
   * C     0 1 1
   * D       0 1
   * E         0
   */
  public static void main(String[] args) {
    Graph theGraph = new Graph()
        .addVertex('A')// 0
        .addVertex('B')// 1
        .addVertex('C')// 2
        .addVertex('D')// 3
        .addVertex('E')// 4
        .addEdge(0, 1) // AB
        .addEdge(0, 2) // AC
        .addEdge(0, 3) // AD
        .addEdge(0, 4) // AE
        .addEdge(1, 2) // BC
        .addEdge(1, 3) // BD
        .addEdge(1, 4) // BE
        .addEdge(2, 3) // CD
        .addEdge(2, 4) // CE
        .addEdge(3, 4);// DE

    System.out.println("Minimum spanning tree: ");
    theGraph.mst();
    System.out.println();
  }
}
