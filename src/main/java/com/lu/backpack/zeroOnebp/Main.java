package com.lu.backpack.zeroOnebp;

public class Main {
  public static void main(String[] args) {
    int[] weight = {2,3,4,5,6};
    int[] value = {4,5,6,7,8};

    int backpackCap = 15;
    BitSolution solution = new BitSolution();
    System.out.println(solution.solution(weight,value,backpackCap));

    ExhaustionSolution solution1 = new ExhaustionSolution();
    System.out.println(solution1.solution(weight,value,backpackCap));
  }
}
