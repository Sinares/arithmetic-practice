package com.lu.arithmetic.mergeTwoLists21;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    ListNode list1 = new ListNode(1);
    ListNode l1 = list1;
    l1.next = new ListNode(3);
    l1 = l1.next;
    l1.next = new ListNode(4);

    ListNode list2 = new ListNode(1);
    l1 = list2;
    l1.next = new ListNode(2);
    l1 = l1.next;
    l1.next = new ListNode(4);

    Solution solution = new Solution();
    ListNode res = solution.mergeTwoLists(list1,list2);

    while(res!=null) {
      System.out.print(res.val);
      res = res.next;
    }
  }
}
