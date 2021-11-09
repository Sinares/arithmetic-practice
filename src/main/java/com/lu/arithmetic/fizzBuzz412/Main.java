package com.lu.arithmetic.fizzBuzz412;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Solution solution = new Solution();

    System.out.println(Arrays.toString(solution.fizzBuzz(3).toArray()));
    System.out.println(Arrays.toString(solution.fizzBuzz(5).toArray()));
    System.out.println(Arrays.toString(solution.fizzBuzz(15).toArray()));
    System.out.println(Arrays.toString(solution.fizzBuzz(20).toArray()));
    System.out.println(Arrays.toString(solution.fizzBuzz(30).toArray()));
  }
}
