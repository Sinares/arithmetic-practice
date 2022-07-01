package com.lu.arithmetic.containsNearbyDuplicate219;

public class Solution {
  public boolean containsNearbyDuplicate(int[] nums, int k) {
    for (int i=0;i< nums.length-1;i++) {
      for (int j=i+1;j< nums.length;j++) {
        if (j-i>k) {
          break;
        }
        if (nums[i]==nums[j]) {
          return true;
        }
      }
    }
    return false;
  }
}
