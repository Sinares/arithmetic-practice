package com.lu.arithmetic.countTriplets1442;

public class Main {
  public static void main(String[] args) {
    Solution solution = new Solution();

    int [] arr = new int[]{2,3,1,6,7};
    int [] arr1 = new int[]{1,1,1,1,1};
    int [] arr2 = new int[]{2,3};
    int [] arr3 = new int[]{1,3,5,7,9};
    int [] arr4 = new int[]{7,11,12,9,5,2,7,17,22};

    System.out.println(solution.countTriplets(arr));
    System.out.println(solution.countTriplets(arr1));
    System.out.println(solution.countTriplets(arr2));
    System.out.println(solution.countTriplets(arr3));
    System.out.println(solution.countTriplets(arr4));
  }
}
