package com.oxiane.katas.shadock;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Shadock {
  public String toShadock(int input) {
    String numberBase4 = Integer.toString(input, 4);
    return numberBase4.chars()
        .mapToObj(value -> Character.toString(value))
        .map(s -> ShadockStrategy.of(s))
        .map(sh -> sh.word())
        .collect(Collectors.joining());
  }

  private enum ShadockStrategy {
    ZERO("0", () -> "GA"),
    ONE("1", () -> "BU"),
    TWO("2", () -> "ZO"),
    THREE("3", () -> "MEU")
    ;

    private final Supplier<String> supplier;
    private final String digit;

    ShadockStrategy(String digit, Supplier<String> supplier) {
      this.digit = digit;
      this.supplier = supplier;
    }

    public static ShadockStrategy of(String s) {
      return Arrays.stream(values())
          .filter(shadockStrategy -> shadockStrategy.digit.equals(s))
          .findFirst()
          .orElseThrow();
    }

    public String word() {
      return supplier.get();
    }
  }
}
