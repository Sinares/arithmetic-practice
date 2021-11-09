package com.lu.backpack.zeroOnebp;

public class ExhaustionSolution {
  public int solution(int[] weight, int[] value, int backpackCap) {
    int [] fValue = new int[backpackCap+1];

    for (int i=0;i<weight.length;i++) {
      for (int j=backpackCap;j>=weight[i];j--) {
        fValue[j]= Math.max(fValue[j], fValue[j - weight[i]] + value[i]);
        System.out.printf("i=%d j=%d weight[i]=%d value[i]=%d fValue[j]=%d%n fValue[j - weight[i]]=%d",i,j,weight[i],value[i],fValue[j],fValue[j - weight[i]]);
      }

    }
    return fValue[backpackCap];
  }
}

