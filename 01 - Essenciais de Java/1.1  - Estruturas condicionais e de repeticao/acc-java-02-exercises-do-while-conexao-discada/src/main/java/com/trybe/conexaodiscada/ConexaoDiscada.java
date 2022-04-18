package com.trybe.conexaodiscada;

import java.util.Random;

/** Classe ConexaoDiscada. */
public class ConexaoDiscada {

  /** Método principal. */
  public static void main(String[] args) {
    int aux = 0;
    do {
      aux++;
    } while (conectou() == false && aux < 3);
  }

  // Chame esta função escrevendo `conectou()`
  static boolean conectou() {
    return conexaoDiscada.verdadeiroOuFalso();
  }

  static ConexaoDiscada conexaoDiscada = new ConexaoDiscada();

  // Retorna verdadeiro ou falso
  boolean verdadeiroOuFalso() {
    return new Random().nextInt(2) == 1;
  }
}
