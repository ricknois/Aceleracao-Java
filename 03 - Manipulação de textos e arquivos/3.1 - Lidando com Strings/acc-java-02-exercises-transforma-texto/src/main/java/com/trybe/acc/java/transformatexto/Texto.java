package com.trybe.acc.java.transformatexto;

public class Texto {
  /** Transforma texto. */
  public String transformaTexto(String texto) {
    String resultado = texto.replace("+", " ");
    if (resultado.indexOf("a") % 2 == 0) {
      resultado = resultado.toUpperCase();
    } else {
      resultado = resultado.split(" ")[0];
    }
    return resultado;
  }
}
