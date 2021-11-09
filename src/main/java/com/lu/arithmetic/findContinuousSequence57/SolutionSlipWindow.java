package com.lu.arithmetic.findContinuousSequence57;

import java.util.ArrayList;
import java.util.List;

public class SolutionSlipWindow {
  public int[][] findContinuousSequence(int target) {
    int start = 1 ;
    int end = 1;
    int sum = 0;
    List<int[]> res = new ArrayList<>();
    while (start <= target / 2){
      if (sum < target) {
        sum += end++;
      } else if ( sum > target) {
        sum -= start++ ;
      } else {
        int [] item = new int[end-start];
        for (int i = start ; i< end ; i++) {
          item[i-start] = i;
        }
        res.add(item);
        sum-=start++;
      }
    }
    return res.toArray(new int[res.size()][]);
  }
}
