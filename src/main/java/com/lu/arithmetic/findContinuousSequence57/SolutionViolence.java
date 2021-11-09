package com.lu.arithmetic.findContinuousSequence57;

import java.util.ArrayList;
import java.util.List;

public class SolutionViolence {
  public int[][] findContinuousSequence(int target) {
    List<int[]> res = new ArrayList<>();
    for(int i = 1;i<=target / 2 ; i++) {
      int j = i;
      int sum = i;
      while (sum <target) {
        sum+=++j;
      }
      if (sum == target) {
        int[] item = new int[j-i+1];
        for (int start = i ; start<= j ; start++) {
          item[start-i] = start;
        }
        res.add(item);
      }
    }
    return res.toArray(new int[res.size()][]);
  }
}
