package com.lu.arithmetic.isValid20;

import java.util.Stack;

public class Solution {
  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for (int i=0;i<s.length();i++) {
      if (s.charAt(i)=='[' || s.charAt(i) == '{' || s.charAt(i)=='(') {
        stack.push(s.charAt(i));
        continue;
      }

      if (s.charAt(i)==']' || s.charAt(i) == '}' || s.charAt(i)==')') {
        if (stack.size() == 0 ) {
          return false;
        }
        char peek = stack.pop();
        if ((peek == '[' && s.charAt(i)!=']') ||
                (peek == '{' && s.charAt(i)!='}')||
                (peek == '(' && s.charAt(i)!=')')){
          return false;
        }

      }
    }
    return stack.size() ==0;
  }
}
