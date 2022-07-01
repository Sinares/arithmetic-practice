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
public class Solution {
  public String defangIPaddr(String address) {
    return address.replace(".","[.]");
  }
}
