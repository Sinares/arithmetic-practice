package com.lu.arithmetic.peakIndexInMountainArray069;

public class Solution {
  public int peakIndexInMountainArray(int[] arr) {
    int sign = 0;
    for (int left = 0, right = arr.length - 1; left <= right; left++, right--) {
      if (arr[left] > arr[left + 1]) {
        sign = left;
        break;
      }
      if (arr[right] > arr[right - 1]) {
        sign = right;
        break;
      }

    }
    return sign;
  }
}
