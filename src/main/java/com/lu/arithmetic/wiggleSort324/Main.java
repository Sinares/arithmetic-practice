/*
 * Copyright (C) 2011-present ShenZhen iBOXCHAIN Information Technology Co.,Ltd.
 *
 * All right reserved.
 *
 * This software is the confidential and proprietary
 * information of iBOXCHAIN Company of China.
 * ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only
 * in accordance with the terms of the contract agreement
 * you entered into with iBOXCHAIN inc.
 */
package com.lu.arithmetic.wiggleSort324;

import com.lu.arithmetic.Utils;

/**
 * @author : lisen
 * @date : 2022/6/28
 **/
public class Main {
  public static void main(String[] args) {
    Solution2 solution = new Solution2();
    int[] nums1 = new int[]{1,5,1,1,6,4};
    solution.wiggleSort(nums1);
    Utils.outNums(nums1);
    int[] nums2 = new int[]{1,3,2,2,3,1};
    solution.wiggleSort(nums2);
    Utils.outNums(nums2);

    int[] nums3 = new int[]{1,3,2,2,3,1,2};
    solution.wiggleSort(nums3);
    Utils.outNums(nums3);

    int[] nums4 = new int[]{1,3,2,2,3,1,2};
    solution.wiggleSort(nums4);
    Utils.outNums(nums4);

    int[] nums5 = new int[]{1,4,3,4,1,2,1,3,1,3,2,3,3};
    solution.wiggleSort(nums5);
    Utils.outNums(nums5);

    int[] nums6 = new int[]{3,1,2,1,2,1,1,1,2};
    solution.wiggleSort(nums6);
    Utils.outNums(nums6);
  }




}
