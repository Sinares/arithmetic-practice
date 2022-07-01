
package com.lu.arithmetic.wiggleSort324;

/**
 * @author : lisen
 * @date : 2022/6/28
 **/
public class Solution {
  public void wiggleSort(int[] nums) {
    System.out.println("序列为:");
    outNums(nums);
    for (int i =0 ;i<nums.length;i++) {
      //找小的
      int sign = i;
      if (i%2==0) {

        for(int j=i+1;j<nums.length;j++) {
          if (nums[j]<nums[sign]) {
            sign = j;
          }
        }
        if (sign!=i) {
          swap(nums,i,sign);
        }
      } else { //找大的
        for(int j=i+1;j<nums.length;j++) {
          if (nums[j]>nums[sign]) {
            sign = j;
          }
        }
        if (sign!=i) {
          swap(nums,i,sign);
        }
      }
      System.out.println("第"+i+"次替换完成，现序列为");
      outNums(nums);
    }
    outNums(nums);
    int times = nums.length%2==0 ? 0 : 1;
    for (int j=nums.length-1;j>1;) {
      if (nums[j]==nums[j-1]) {
        swap(nums,j-1,times);
        times+=2;
        j-=2;
      } else {
        break;
      }
    }
  }

  private void swap(int[] nums, int i, int sign) {
    nums[i] ^= nums[sign];
    nums[sign] ^= nums[i];
    nums[i] ^= nums[sign];
  }

  private static void outNums(int[] nums) {
    for (int num : nums) {
      System.out.print(num+" ");
    }
    System.out.println();
  }
}