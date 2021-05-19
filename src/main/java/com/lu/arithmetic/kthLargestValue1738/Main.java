package com.lu.arithmetic.kthLargestValue1738;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Solution solution = new Solution();

    int [][] matrix = new int[][]{{5,2},{1,6}};
    System.out.println(solution.kthLargestValue(matrix,2));


    int [][] matrix2 = new int[][]{{8,10,5,8,5,7,6,0,1,4,10,6,4,3,6,8,7,9,4,2}};
    System.out.println(solution.kthLargestValue(matrix2,2));

    int [][] matrix3 = new int[466][249];
    FileReader file = null;
    try {
      file = new FileReader("F:\\matrix.txt");
      BufferedReader br = new BufferedReader(file);

      int line = 0;
      String templine = null;
      while ((templine = br.readLine()) !=null) {
//        System.out.println(line+" : "+templine);
        List<String> ar = Arrays.asList(templine.split(","));
        for (int i=0;i< ar.size() ;i++ ){
          matrix3[line][i] = Integer.parseInt(ar.get(i));
        }
        line ++;
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println(solution.kthLargestValue(matrix3, 114169));
  }
}
