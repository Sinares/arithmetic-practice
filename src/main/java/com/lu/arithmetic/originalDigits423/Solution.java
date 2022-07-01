package com.lu.arithmetic.originalDigits423;

import java.util.Arrays;

public class Solution {
  private final String[] directs = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
  private final int[] seq = new int[]{0, 2, 4, 6, 8, 3, 5, 1, 7, 9};

  public String originalDigits(String s) {
    int[] sCount = new int[26];
    for (int i = 0; i < s.length(); i++) {
      sCount[s.charAt(i) - 'a'] += 1;
    }
    StringBuilder sb = new StringBuilder();

    for (int i : seq) {
      char[] eng = directs[i].toCharArray();
      int k = Integer.MAX_VALUE;
      for (char sign : eng) {
        k = Math.min(k, sCount[sign - 'a']);
      }
      for (char sign : eng) {
        sCount[sign - 'a'] -= k;
      }
      while (k-- > 0)
        sb.append(i);
    }
    char[] cs = sb.toString().toCharArray();
    Arrays.sort(cs);
    return String.valueOf(cs);
  }
}
