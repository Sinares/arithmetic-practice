package com.lu.arithmetic.removeDuplicates;

public class Solution {
  public int removeDuplicates(int[] nums) {
    if (nums.length==1 || nums.length==0) {
      return nums.length;
    }
    int newLength  = 0;
    int sign = 0;
    int curr = nums[0];
    for (int i = 1 ; i< nums.length ;i++) {
      if (nums[i] == nums[i-1]) {
        sign++;
      } else {
        curr = nums[i];
        newLength ++;
        sign++;
        for(int j=newLength ;j<sign;j++) {
          nums[j]=curr;
        }
        i=newLength;
        sign=newLength;
      }
    }
//
    for (int i=0;i<newLength+1 ;i++) {
      System.out.print(nums[i]);
    }
    System.out.println();
    return newLength+1;
  }
}
