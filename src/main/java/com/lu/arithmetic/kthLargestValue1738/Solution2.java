package com.lu.arithmetic.kthLargestValue1738;

import java.util.PriorityQueue;

public class Solution2 {
  public int kthLargestValue(int[][] matrix, int k) {
    PriorityQueue<Integer> q = new PriorityQueue<>(k, (a, b)->a - b);
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (i == 0 && j == 0) {
        } else if (i == 0) {
          matrix[i][j] = matrix[i][j - 1] ^ matrix[i][j];
        } else if (j == 0) {
          matrix[i][j] = matrix[i - 1][j] ^ matrix[i][j];
        } else {
          matrix[i][j] = matrix[i - 1][j - 1] ^ matrix[i - 1][j] ^ matrix[i][j - 1] ^ matrix[i][j];
        }
        if (q.size() < k) {
          q.add(matrix[i][j]);
        } else {
          if (matrix[i][j] > q.peek()) {
            q.poll();
            q.add(matrix[i][j]);
          }
        }
      }
    }
    return q.peek();
  }
}
