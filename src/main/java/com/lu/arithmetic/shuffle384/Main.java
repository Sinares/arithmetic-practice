package com.lu.arithmetic.shuffle384;

public class Main {
  public static void main(String[] args) {
    Solution solution = new Solution(new int []{1,2,3});
    print(solution.reset());
    print(solution.shuffle());
    print(solution.reset());
    print(solution.shuffle());
  }

  private static void print(int[] nums) {
    for (int i=0;i<nums.length;i++) {
      System.out.print(nums[i]+" ");
    }
    System.out.println();
  }
}
