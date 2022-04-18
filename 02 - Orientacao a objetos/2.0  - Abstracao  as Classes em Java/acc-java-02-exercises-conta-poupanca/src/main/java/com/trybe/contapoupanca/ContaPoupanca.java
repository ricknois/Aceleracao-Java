package com.trybe.contapoupanca;

public class ContaPoupanca {
  private double saldo;

  private String titularConta;

  public ContaPoupanca(String titularConta, double saldo) {
    this.saldo = saldo;
    this.titularConta = titularConta;
  }

  public void depositar(double valor) {
    this.saldo = this.saldo + valor;
  }

  public void sacar(double valor) {
    this.saldo = this.saldo - valor;
  }

  public double mostrarSaldo() {
    return this.saldo;
  }

  public String mostrarTitularConta() {
    return this.titularConta;
  }
}
