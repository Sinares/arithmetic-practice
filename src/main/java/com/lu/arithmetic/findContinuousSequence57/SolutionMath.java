package com.lu.arithmetic.findContinuousSequence57;

import java.util.ArrayList;
import java.util.List;

public class SolutionMath {
  public int[][] findContinuousSequence(int target) {
    int i = 1;
    double j = 2.0;
    List<int[]> res = new ArrayList<>();
    while(i < j) {
      j = (-1 + Math.sqrt(1 + 4 * (2L * target + (long) i * i - i))) / 2;
      if(i < j && j == (int)j) {
        int[] ans = new int[(int)j - i + 1];
        for(int k = i; k <= (int)j; k++)
          ans[k - i] = k;
        res.add(ans);
      }
      i++;
    }
    return res.toArray(new int[0][]);
  }
}
