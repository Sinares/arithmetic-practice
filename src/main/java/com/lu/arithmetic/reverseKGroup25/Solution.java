package com.lu.arithmetic.reverseKGroup25;

public class Solution {
  public ListNode reverseKGroup(ListNode head, int k) {
    ListNode newList = new ListNode();

    ListNode sign = newList.next;

    ListNode curr = head;
    while(curr.next!=null) {
      ListNode newNode1 = curr;
      curr =curr.next;
      for (int i=0;i<k;i++) {

      }
    }

    return new ListNode();
  }
}
