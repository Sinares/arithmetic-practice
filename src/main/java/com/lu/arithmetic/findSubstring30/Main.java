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
package com.lu.arithmetic.findSubstring30;

import java.util.List;

/**
 * @author : lisen
 * @date : 2022/6/23
 **/
public class Main {
  public static void main(String[] args) {
    Solution solution = new Solution();

    SysOut(solution.findSubstring("barfoothefoobarman",new String[]{"foo","bar"}));
    SysOut(solution.findSubstring("wordgoodgoodgoodbestword",new String[]{"word","good","best","word"}));
    SysOut(solution.findSubstring("wordgoodgoodgoodbestword",new String[]{"word","good","best"}));
  }

  private static void SysOut(List<Integer> res) {
    res.forEach(i -> System.out.print(i+" "));
    System.out.println();
  }
}
