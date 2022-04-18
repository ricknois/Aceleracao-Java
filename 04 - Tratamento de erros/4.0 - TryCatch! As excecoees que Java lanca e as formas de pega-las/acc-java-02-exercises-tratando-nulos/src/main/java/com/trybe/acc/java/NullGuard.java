package com.trybe.acc.java;

public class NullGuard {
  /** Imprime nome. */
  public String printName(int divisor) {
    String result;
    NullGenerator generator = new NullGenerator();
    try {
      result = generator.getNome(divisor);
    } catch (NullPointerException e) {
      return "Nome nulo";
    }
    return result;
  }
}
