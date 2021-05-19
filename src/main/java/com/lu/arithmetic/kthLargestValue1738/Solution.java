package com.lu.arithmetic.kthLargestValue1738;

import java.util.*;

public class Solution {
  public int kthLargestValue(int[][] matrix, int k) {
    int[][] res = new int[matrix.length][matrix[0].length];
    PriorityQueue<Integer> q = new PriorityQueue<>(k, (a, b)->a - b);
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (i == 0 && j == 0) {
          res[i][j] = matrix[i][j];
        } else if (i == 0) {
          res[i][j] = res[i][j - 1] ^ matrix[i][j];
        } else if (j == 0) {
          res[i][j] = res[i - 1][j] ^ matrix[i][j];
        } else {
          res[i][j] = res[i - 1][j - 1] ^ res[i - 1][j] ^ res[i][j - 1] ^ matrix[i][j];
        }
        if (q.size() < k) {
          q.add(res[i][j]);
        } else {
          if (res[i][j] > q.peek()) {
            q.poll();
            q.add(res[i][j]);
          }
        }
      }
    }
    return q.peek();
  }
}
