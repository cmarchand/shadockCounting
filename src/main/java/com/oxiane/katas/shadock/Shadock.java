package com.oxiane.katas.shadock;

import java.util.stream.Collectors;

public class Shadock {
  private static final String[] WORDS = {"GA", "BU", "ZO", "MEU"};
  public String toShadock(int input) {
    String numberBase4 = Integer.toString(input, WORDS.length);
    return numberBase4.chars()
        .map(i -> i - '0')
        .mapToObj(i -> WORDS[i])
        .collect(Collectors.joining());
  }

  public int toNumber(String inputShadock) {
    String copy = inputShadock;
    String result="";
    while(!copy.isEmpty()) {
      for (int i = 0; i < WORDS.length; i++) {
        String word = WORDS[i];
        if(copy.startsWith(word)) {
          result+=i;
          copy = copy.substring(word.length());
          break;
        }
      }
    }
    return Integer.parseInt(result, WORDS.length);
  }
}
