package com.lu.arithmetic.fib509;

public class Solution {
  public int fib(int n) {
    if (n==0) {
      return 0;
    }
    if (n==1 || n==2) {
      return 1;
    }
    int sum = 1;
    int preSum = 1;
    for (int i=3;i<=n ;i++) {
      sum ^= preSum;
      preSum ^= sum;
      sum ^= preSum;
      sum = preSum + sum;
    }
    return sum;
  }
}
