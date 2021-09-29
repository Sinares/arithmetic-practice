package com.lu.arithmetic.topKFrequent692;

import java.util.*;

public class Solution2 {
  public List<String> topKFrequent(String[] words, int k) {
    Map<String,Integer> resMap = new HashMap<>();
    PriorityQueue<String> q = new PriorityQueue<>((a, b)->{
      int countA = resMap.get(a);
      int countB = resMap.get(b);
      if (countA == countB) {
        return b.compareTo(a);
      }
      return  countA-countB;
    });

    for (String word : words) {
      if (resMap.containsKey(word) ) {
        resMap.put(word, resMap.get(word) + 1);
      }else {
        resMap.put(word, 1);
      }
      q.offer(word);
      if (q.size() > k) {
        q.poll();
      }
    }
    // 利用栈特性
    LinkedList<String> stack = new LinkedList<>();
    while (!q.isEmpty()) {
      stack.push(q.poll());
    };
    return stack;
  }
}
