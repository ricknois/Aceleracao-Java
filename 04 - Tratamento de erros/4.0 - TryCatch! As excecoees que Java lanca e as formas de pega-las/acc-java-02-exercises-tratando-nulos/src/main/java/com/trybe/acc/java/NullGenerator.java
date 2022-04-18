package com.trybe.acc.java;

public class NullGenerator {
  /** Retorna nome. */
  public String getNome(int num) {
    if (num % 2 == 0) {
      return "BOB";
    } else {
      throw new NullPointerException();
    }
  }
}
