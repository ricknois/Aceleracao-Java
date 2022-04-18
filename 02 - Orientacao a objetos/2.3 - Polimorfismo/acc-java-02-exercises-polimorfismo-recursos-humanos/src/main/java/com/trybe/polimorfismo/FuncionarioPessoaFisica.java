package com.trybe.polimorfismo;

public class FuncionarioPessoaFisica extends Funcionario {

  public FuncionarioPessoaFisica() {
    super();
  }

  @Override
  public double calcularSalarioLiquido() {
    return super.salarioBruto * 0.8;
  }
}
