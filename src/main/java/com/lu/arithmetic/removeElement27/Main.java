package com.lu.arithmetic.removeElement27;

public class Main {
  public static void main(String[] args) {
    int [] nums = new int[]{3,2,2,3};
    int [] nums2 = new int[]{0,1,2,2,3,0,4,2};
    int [] nums3 = new int[]{3,2,2,3,3,4,5,5,8,7,4,9,3,5,4,2,3};

    Solution solution =new Solution();
    int length1 = solution.removeElement(nums,3);
    int length2 = solution.removeElement(nums2,2);
    int length3 = solution.removeElement(nums3,3);

    print(nums,length1);
    print(nums2,length2);
    print(nums3,length3);
  }

  private static void print(int[] nums, int length) {
    for (int i =0;i <length ; i++) {
      System.out.print(nums[i]);
    }
    System.out.println();
  }
}
