package com.trybe.acc.java.sistemadevotacao;

import java.util.Scanner;

public class Principal {

  /** Classe Principal. */
  public static void main(String[] args) {

    short option;
    String nome;
    String cpf;
    short numero;

    Scanner scan = new Scanner(System.in);
    GerenciamentoVotacao gerenciamento = new GerenciamentoVotacao();

    do {
      System.out.println(
          "Cadastrar pessoa candidata?\n"
              + "1 - Sim\n"
              + "2 - Não\n"
              + "Entre com o número correspondente à opção desejada:\n");

      option = scan.nextShort();

      if (option == 1) {
        System.out.println("Entre com o nome da pessoa candidata:\n");
        nome = scan.next();
        System.out.println("Entre com o número da pessoa candidata:\n");
        numero = scan.nextShort();
        gerenciamento.cadastrarPessoaCandidata(nome, numero);
      }

    } while (option != 2);

    do {
      System.out.println(
          "Cadastrar pessoa eleitora?\n"
              + "1 - Sim\n"
              + "2 - Não\n"
              + "Entre com o número correspondente à opção desejada:");

      option = scan.nextShort();
      if (option == 1) {
        System.out.println("Entre com o nome da pessoa eleitora:");
        nome = scan.next();
        System.out.println("Entre com o cpf da pessoa eleitora:");
        cpf = scan.next();
        gerenciamento.cadastrarPessoaEleitora(nome, cpf);
      }
    } while (option != 2);

    do {
      System.out.println(
          "Entre com o número correspondente à opção desejada:\n"
              + "1 - Votar\n"
              + "2 - Resultado Parcial\n"
              + "3 - Finalizar Votação\n");
      option = scan.nextShort();

      if (option == 1) {
        System.out.println("Entre com o cpf da pessoa eleitora:");
        cpf = scan.next();
        System.out.println("Entre com o número da pessoa candidata:");
        numero = scan.nextShort();
        gerenciamento.votar(cpf, numero);
      } else if (option == 2) {
        gerenciamento.mostrarResultado();
      }
    } while (option != 3);

    gerenciamento.mostrarResultado();
    scan.close();
  }
}
