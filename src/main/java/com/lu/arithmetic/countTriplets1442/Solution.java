package com.lu.arithmetic.countTriplets1442;

public class Solution {
  public int countTriplets(int[] arr) {
    int sum = 0;

    for (int i = 0; i < arr.length - 1; i++) {
      int curr = arr[i];
      for (int k = i + 1; k < arr.length; k++) {
        curr = curr ^ arr[k];
        if (curr == 0) {
          sum += (k-i);
        }
      }
    }
    return sum;
  }
}
