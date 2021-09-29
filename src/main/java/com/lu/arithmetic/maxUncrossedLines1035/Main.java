package com.lu.arithmetic.maxUncrossedLines1035;

public class Main {
  public static void main(String[] args) {
    Solution solution =new Solution();
    int [] nums1= new int[]{1,4,2};
    int [] nums2= new int[]{1,2,4};
    System.out.println(solution.maxUncrossedLines(nums1,nums2));

    int [] nums3= new int[]{2,5,1,2,5};
    int [] nums4= new int[]{10,5,2,1,5,2};
    System.out.println(solution.maxUncrossedLines(nums3,nums4));

    int [] nums5= new int[]{1,3,7,1,7,5};
    int [] nums6= new int[]{1,9,2,5,1};
    System.out.println(solution.maxUncrossedLines(nums5,nums6));


  }
}
