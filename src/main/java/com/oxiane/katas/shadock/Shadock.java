package com.oxiane.katas.shadock;

import java.util.stream.Collectors;

public class Shadock {
  private static final String[] WORDS = {"GA", "BU", "ZO", "MEU"};
  public String toShadock(int input) {
    String numberBase4 = Integer.toString(input, 4);
    return numberBase4.chars()
        .map(i -> i - '0')
        .mapToObj(i -> WORDS[i])
        .collect(Collectors.joining());
  }

}
