package com.lu.arithmetic.numberToWords273;

public class Solution {
  String[] singles = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
  String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
  String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
  String[] thousands = {"", "Thousand", "Million", "Billion"};

  //  2147483647
  //100000000
  public String numberToWords(int num) {
    if (num == 0) {
      return "Zero";
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 3, sign = 1000000000; i >= 0; i--, sign /= 1000) {
      int curr = num / sign;
      if (curr == 0) {
        continue;
      }
      num = num-(sign*curr);
      sb.append(calculate(curr));
      sb.append(thousands[i]);
      sb.append(" ");
    }
    return sb.toString().trim();
  }

  private String calculate(int curr) {
    StringBuilder csb = new StringBuilder();
    int hundred = curr / 100;
    if (hundred != 0) {
      csb.append(singles[hundred]).append(" Hundred ");
    }
    curr %= 100;
    int ten = curr / 10;
    if (ten >= 2) {
      csb.append(tens[ten]).append(" ");
      curr %= 10;
    }
    if (curr > 0 && curr < 10) {
      csb.append(singles[curr]).append(" ");
    } else if (curr >= 10) {
      csb.append(teens[curr % 10]).append(" ");
    }
    return csb.toString();
  }
}