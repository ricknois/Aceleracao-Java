package com.trybe.acc.java.sistemadevotacao;

import java.util.ArrayList;

public class GerenciamentoVotacao {

  private ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<>();
  private ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<>();
  private ArrayList<String> cpfComputado = new ArrayList<>();
  private int totalVotos = 0;

  /** Cria Candidato. */
  public void cadastrarPessoaCandidata(String nome, int numero) {
    pessoasCandidatas.forEach(
        pessoa -> {
          if (pessoa.getNumero() == numero) {
            System.out.println("Número pessoa candidata já utilizado!");
            return;
          }
        });
    pessoasCandidatas.add(new PessoaCandidata(nome, numero));
  }

  /** Cria eleitor. */
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    pessoasEleitoras.forEach(
        pessoa -> {
          if (pessoa.getCpf().equals(cpf)) {
            System.out.println("Pessoa eleitora já cadastrada!");
            return;
          }
        });
    pessoasEleitoras.add(new PessoaEleitora(nome, cpf));
  }

  /** Vota. */
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    cpfComputado.forEach(
        cpf -> {
          if (cpf.equals(cpfPessoaEleitora)) {
            System.out.println("Pessoa eleitora já votou!");
            return;
          }
        });

    pessoasCandidatas.forEach(
        pessoa -> {
          if (pessoa.getNumero() == numeroPessoaCandidata) {
            pessoa.receberVoto();
            cpfComputado.add(cpfPessoaEleitora);
            totalVotos = cpfComputado.size();
          }
        });
  }

  int index = 0;

  /** Mostra resultados. */
  public void mostrarResultado() {
    if (totalVotos == 0) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
    } else {
      pessoasCandidatas.forEach(
          pessoa -> {
            System.out.println(
                "Nome: "
                    + pessoa.getNome()
                    + " - "
                    + pessoa.getVotos()
                    + " votos ( "
                    + calcularPorcentagemVotos(index)
                    + "% )");
            index++;
          });
      System.out.println("Total de votos: " + totalVotos);
    }
  }

  private double calcularPorcentagemVotos(int index) {
    return pessoasCandidatas.get(index).getVotos() * 100 / totalVotos;
  }
}
