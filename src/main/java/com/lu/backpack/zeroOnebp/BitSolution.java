package com.lu.backpack.zeroOnebp;

public class BitSolution {

  public int solution(int[] weight, int[] value, int backpackCap) {

    int ww = 0;
    int vv = 0;
    int maxv = 0;
    int strres = 0;

    int offset = 1 << weight.length;

    for (int i = 0; i < offset; i++){//二进制最大可能选择数
      for (int j = 0; j < weight.length; j++) {
        //判断当前位子是否被选择, 更新0或1倍目标值的数值
        int ic = i>>j & 1;
        ww += ic * weight[j];
        vv += ic * value[j];
      }

      if (ww <= backpackCap && vv > maxv) {
        maxv = vv;
        strres = i;//更新
      }

      vv = 0;
      ww = 0;
    }
    for (int i=0;i<weight.length;i++) {
      int path = strres>>i&1;
      System.out.print(path);
    }
    System.out.println();
    return maxv;
  }
}
