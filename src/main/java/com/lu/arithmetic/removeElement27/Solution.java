package com.lu.arithmetic.removeElement27;

public class Solution {
  public int removeElement(int[] nums, int val) {
    int length = nums.length;
    for (int i = 0; i < length; ) {
      if (nums[i] == val) {
        if (length - 1 - i >= 0) {
          System.arraycopy(nums, i + 1, nums, i, length - 1 - i);
        }
        length--;
      } else {
        i++;
      }
    }
    return length;
  }
}
