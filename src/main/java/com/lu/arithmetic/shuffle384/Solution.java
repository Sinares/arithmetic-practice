package com.lu.arithmetic.shuffle384;

import java.util.*;

public class Solution {
  private int [] origin;

  public Solution(int[] nums) {
    origin = new int[nums.length];
    System.arraycopy(nums,0,origin,0,nums.length);
  }

  public int[] reset() {
    int[] nums = new int[origin.length];
    System.arraycopy(origin,0,nums,0,origin.length);
    return nums;
  }

  public int[] shuffle() {
    List<Integer> shuffle = new ArrayList<>();
    for (int j : origin) {
      shuffle.add(j);
    }
    Collections.shuffle(shuffle);
    int[] nums = new int[origin.length];
    for (int i=0;i<nums.length;i++) {
      nums[i] = shuffle.get(i);
    }
    return nums;
  }
}
