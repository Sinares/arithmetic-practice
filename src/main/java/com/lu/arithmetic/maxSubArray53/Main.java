package com.lu.arithmetic.maxSubArray53;

public class Main {
  public static void main(String[] args) {
    Solution solution = new Solution();
    int [] nums1= new int[]{-2,1,-3,4,-1,2,1,-5,4};
    System.out.println(solution.maxSubArray(nums1));

    int [] nums2= new int[]{1};
    System.out.println(solution.maxSubArray(nums2));
  }
}
