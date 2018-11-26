package com.kluke.examples;

/**
 * Suppose you want your knapsack to weigh exactly 20 lbs, and you have five items with weights of
 * 11,8,7,6, and 5 lbs.  Figure out which combination adds up to 20 lbs. (8,7,5)
 *
 * Try every combo of each weight against every combo of each weight.
 *
 * If weight == 20, then you're done!
 *
 * If weight > 20, discard and move on.
 */
public class KnapsackProblem {

  private static int[] weights       = new int[]{11, 8, 7, 6, 5};
  private static int[] solution      = new int[weights.length];
  private static int   backpackTotal = 20;

  public static void main(String[] args) {
    for (int x = 0; x < weights.length; x++) {
      for (int y = 0; y < weights.length; y++) {
        for (int z = 0; z < weights.length; z++) {
          if (weights[x] != weights[y] && weights[y] != weights[z] && weights[x] != weights[z]) {
            if (weights[x] + weights[y] + weights[z] == backpackTotal) {
              System.out.println(weights[x] + " " + weights[y] + " " + weights[z] + " = " + backpackTotal);
            }
          }
        }
      }
    }
  }
}
