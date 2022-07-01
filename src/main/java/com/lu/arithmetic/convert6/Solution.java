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
package com.lu.arithmetic.convert6;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : lisen
 * @date : 2022/6/21
 **/
public class Solution {
  public String convert(String s, int numRows) {
    if (numRows < 2) {
      return s;
    }
    List<StringBuilder> zWords = new ArrayList<>();
    for (int i =0 ; i< numRows ;i++) {
      zWords.add(new StringBuilder());
    }

    int flag = -1;
    int sign = 0;

    for (char item : s.toCharArray()) {
      zWords.get(sign).append(item);
      if (sign == 0 || sign == numRows -1) flag = -flag;
      sign+=flag;
    }

    StringBuilder res = new StringBuilder();

    for(StringBuilder item : zWords) {
      res.append(item);
    }
    return res.toString();
  }
}
