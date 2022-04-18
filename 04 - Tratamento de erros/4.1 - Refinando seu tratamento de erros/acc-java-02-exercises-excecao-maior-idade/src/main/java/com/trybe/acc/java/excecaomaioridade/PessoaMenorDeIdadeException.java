package com.trybe.acc.java.excecaomaioridade;

public class PessoaMenorDeIdadeException extends Exception {
  public PessoaMenorDeIdadeException() {
    super("A pessoa deve ser maior de idade");
  }
}
