package com.lu.arithmetic.buddyStrings859;

public class Solution {
  public boolean buddyStrings(String s, String goal) {
    if (s.length() != goal.length()) {
      return false;
    }

    int[] sCnt = new int[26];
    int[] goalCnt = new int[26];
    int flag = 0;
    for (int i = 0; i < s.length(); i++) {
      int a = s.charAt(i) - 'a';
      int b = goal.charAt(i) - 'a';
      sCnt[a]++;
      goalCnt[b]++;
      if (a != b) {
        flag++;
      }
    }
    boolean isRepeat = false;
    for (int i = 0; i < sCnt.length; i++) {
      if (sCnt[i] != goalCnt[i]) {
        return false;
      }
      if (sCnt[i] > 1) {
        isRepeat = true;
      }
    }
    return flag == 2 || (flag == 0 && isRepeat);
  }
}
