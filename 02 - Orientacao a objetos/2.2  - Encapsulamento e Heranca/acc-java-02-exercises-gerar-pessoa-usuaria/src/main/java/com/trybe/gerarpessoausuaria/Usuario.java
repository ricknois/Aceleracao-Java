package com.trybe.gerarpessoausuaria;

public class Usuario extends Pessoa {

  public Usuario(String nome, String sobrenome) {
    super(nome, sobrenome);
  }

  /** Método para pegar o nome e sobrenome do usuário. */
  public String getUsuario() {
    if (super.nome == ""
        || super.nome == null
        || super.sobrenome == ""
        || super.sobrenome == null) {
      return "Usuário inválido";
    }
    return nome + "." + sobrenome;
  }
}
