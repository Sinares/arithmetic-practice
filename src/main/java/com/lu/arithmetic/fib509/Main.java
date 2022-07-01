package com.lu.arithmetic.fib509;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
  public static void main(String[] args) {
//    Solution solution = new Solution();
//    System.out.println(solution.fib(1));
//    System.out.println(solution.fib(2));
//    System.out.println(solution.fib(3));
//    System.out.println(solution.fib(4));
//    System.out.println(solution.fib(5));
//    System.out.println(solution.fib(6));
//    System.out.println(solution.fib(7));
//    System.out.println(solution.fib(8));

    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
    try {
      Date start = sdf.parse("202109");
      Date end = sdf.parse("202108");
      System.out.println(getDiffMonth(start,end));
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }

  public static int getDiffMonth(Date startDate, Date endDate) {
    Calendar start = Calendar.getInstance();
    Calendar end = Calendar.getInstance();
    start.setTime(startDate);
    end.setTime(endDate);
    int result = end.get(Calendar.MONTH) - start.get(Calendar.MONTH);
    int month = (end.get(Calendar.YEAR) - start.get(Calendar.YEAR)) * 12;
    return month + result;
  }
}
