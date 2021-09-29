package com.lu.arithmetic.topKFrequent692;

public class Main {
  public static void main(String[] args) {
    Solution2 solution = new Solution2();

    String[] strs = new String[] {"i", "love", "leetcode", "i", "love", "coding"};
    int k = 2;
    System.out.println(solution.topKFrequent(strs,k));


    String[] strs1 = new String[] {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
    int k1 = 4;
    System.out.println(solution.topKFrequent(strs1,k1));
  }
}
