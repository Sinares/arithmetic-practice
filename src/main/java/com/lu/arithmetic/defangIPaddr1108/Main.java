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
package com.lu.arithmetic.defangIPaddr1108;

/**
 * @author : lisen
 * @date : 2022/6/21
 **/
public class Main {
  public static void main(String[] args) {
    Solution solution = new Solution();

    System.out.println(solution.defangIPaddr("1.1.1.1"));
    System.out.println(solution.defangIPaddr("255.100.50.0"));
    System.out.println(solution.defangIPaddr("172.168.0.1 "));
  }
}
