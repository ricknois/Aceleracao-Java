package com.trybe.polimorfismo;

public class FuncionarioPessoaJuridica extends Funcionario {

  public FuncionarioPessoaJuridica() {
    super();
  }

  @Override
  public double calcularSalarioLiquido() {
    return super.salarioBruto * 0.9;
  }
}
