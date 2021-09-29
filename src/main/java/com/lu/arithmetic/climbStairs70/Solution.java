package com.lu.arithmetic.climbStairs70;

public class Solution {
  public int climbStairs(int n) {
    if ( n==1) {
      return 1;
    }
    int sum = 1;
    int preSum = 1;
    for (int i=2;i<=n ;i++) {
      sum ^= preSum;
      preSum ^= sum;
      sum ^= preSum;
      sum = preSum + sum;
    }
    return sum;
  }
}
