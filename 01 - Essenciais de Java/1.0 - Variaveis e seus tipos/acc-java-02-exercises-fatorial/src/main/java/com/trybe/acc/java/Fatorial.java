package com.trybe.acc.java;

public class Fatorial {
  /** Retorna o fatorial. */
  public static void main(String[] args) {
    long fatorial18 = fatorial(18);
    System.out.println("O fatorial de 18 é igual a " + fatorial18);
  }

  private static long fatorial(int num) {
    int prev = num - 1;
    long currFatorial = 0;
    if (num <= 1) {
      return 1;
    } else {
      currFatorial = num * fatorial(prev);
      return currFatorial;
    }
  }
}
