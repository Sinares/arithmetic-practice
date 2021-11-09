package com.lu.arithmetic.findContinuousSequence57;

public class Main {
  public static void main(String[] args) {
//    SolutionViolence solution = new SolutionViolence();
//    SolutionSlipWindow solution = new SolutionSlipWindow();
    SolutionMath solution = new SolutionMath();
    int[][] a = solution.findContinuousSequence(9);
    print(a);
    a = solution.findContinuousSequence(15);
    print(a);
    a = solution.findContinuousSequence(18);
    print(a);
  }

  private static void print(int[][] a) {
    for (int i = 0 ; i < a.length ; i++) {
      for (int j=0;j<a[i].length;j++) {
        System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }
    System.out.println();
  }
}
