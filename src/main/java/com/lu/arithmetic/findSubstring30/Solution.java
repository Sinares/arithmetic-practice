package com.lu.arithmetic.findSubstring30;

import java.util.*;

/**
 * @author : lisen
 * @date : 2022/6/23
 **/
public class Solution {
  public List<Integer> findSubstring(String s, String[] words) {
    List<Integer> res = new ArrayList<>();
    if ( s==null || s.length() == 0 || words == null || words.length ==0 ) return res;
    int allWordLength = 0;
    int oneWordLength = words[0].length();
    Map<String,Integer> wordMap = new HashMap<>();
    for(String word:words) {
      allWordLength += word.length();
      if (wordMap.containsKey(word)) {
        wordMap.put(word,wordMap.get(word)+1);
      } else {
        wordMap.put(word,1);
      }
    }
    for (int i=0,j=i+allWordLength;i<s.length()&&j<=s.length();i++,j++) {
      Map<String,Integer> childWords = new HashMap<>();
      String item = s.substring(i,j);
      for (int ii =0;ii<words.length;ii++) {
        String child = item.substring(ii*oneWordLength,(ii+1)*oneWordLength);
        if (childWords.containsKey(child)) {
          childWords.put(child,childWords.get(child)+1);
        } else {
          childWords.put(child,1);
        }
      }
      if (childWords.equals(wordMap)) {
        res.add(i);
      }
    }
    return res;
  }
}
