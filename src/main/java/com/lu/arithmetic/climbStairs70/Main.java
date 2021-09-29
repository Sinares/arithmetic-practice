package com.lu.arithmetic.climbStairs70;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
  public static void main(String[] args) {

    String a = buildKey(1,2,"3gff",11);

    System.out.println(a);

  }


  private static String buildKey(Object... keys) {
    StringBuilder value = new StringBuilder();
    for (Object key : keys) {
      value.append(key);
      value.append("_");
    }
    return value.substring(0,value.length()-1);
  }
}
