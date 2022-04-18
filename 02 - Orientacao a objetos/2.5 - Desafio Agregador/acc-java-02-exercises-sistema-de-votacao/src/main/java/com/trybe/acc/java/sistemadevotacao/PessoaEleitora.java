package com.trybe.acc.java.sistemadevotacao;

public class PessoaEleitora extends Pessoa {

  private String cpf;

  /** Classe pessoa eleitora. */
  public PessoaEleitora(String nome, String cpf) {
    super();
    this.setNome(nome);
    this.cpf = cpf;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
