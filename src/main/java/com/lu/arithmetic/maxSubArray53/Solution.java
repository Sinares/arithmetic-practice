package com.lu.arithmetic.maxSubArray53;

public class Solution {
  public int maxSubArray(int[] nums) {
    int max = nums[0];
    for(int i=1;i<nums.length;i++) {
      nums[i] = Math.max(nums[i],nums[i]+nums[i-1]);
      if (nums[i] > max ) {
        max = nums[i];
      }
    }
    return max;
  }
}
