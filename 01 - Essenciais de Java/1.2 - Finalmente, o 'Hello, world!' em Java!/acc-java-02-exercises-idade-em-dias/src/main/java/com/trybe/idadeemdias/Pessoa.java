package com.trybe.idadeemdias;

public class Pessoa {
  public static int calcularIdadeEmDias(int years, int months, int days) {
    int result = (years * 365) + (months * 30) + days;
    return result;
  }
}