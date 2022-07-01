package com.lu.arithmetic.shortestCompletingWord748;

import java.util.Arrays;

public class Solution {
  public String shortestCompletingWord(String licensePlate, String[] words) {
    licensePlate = licensePlate.toLowerCase();
    int[] ac = new int[26];
    int sum = 0;
    for (int i = 0; i < licensePlate.length(); i++) {
      char sign = licensePlate.charAt(i);
      if (sign >= 'a' && sign <= 'z') {
        ac[licensePlate.charAt(i) - 'a'] += 1;
        sum++;
      }
    }



    int minis = Integer.MAX_VALUE;
    String res = "";
    for (String word : words) {
      int anotherSum = 0;
      int[] acTemp = Arrays.copyOf(ac, ac.length);
      for (int i = 0; i < word.length(); i++) {
        char curr = word.toLowerCase().charAt(i);
        if ( acTemp[curr- 'a'] > 0) {
          acTemp[curr - 'a'] -= 1;
          anotherSum++;
        }
      }
      if (sum == anotherSum && word.length()-licensePlate.length()<minis) {
        res =word;
        minis= word.length()-licensePlate.length();
      }
    }
    return res;
  }
}
