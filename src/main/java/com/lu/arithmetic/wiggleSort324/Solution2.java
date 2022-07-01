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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : lisen
 * @date : 2022/6/28
 **/
public class Solution2 {
  public void wiggleSort(int[] nums) {
    Arrays.sort(nums);
    List<Integer> res = new ArrayList<>();
    if (nums.length % 2 == 1) {
      int i = (nums.length) / 2;
      int j = nums.length - 1;
      while (j > (nums.length) / 2) {
        res.add(nums[i]);
        res.add(nums[j]);
        i--;
        j--;
      }
      if (i == 0) {
        res.add(nums[i]);
      }
    } else {
      int i = (nums.length) / 2-1;
      int j = nums.length - 1;
      while (j > (nums.length) / 2-1) {
        res.add(nums[i]);
        res.add(nums[j]);
        i--;
        j--;
      }
    }
    for (int ii = 0; ii < nums.length; ii++) {
      nums[ii] = res.get(ii);
    }
  }
}
