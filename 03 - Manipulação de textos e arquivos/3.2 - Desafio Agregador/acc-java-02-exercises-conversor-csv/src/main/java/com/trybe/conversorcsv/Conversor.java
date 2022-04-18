package com.trybe.conversorcsv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Conversor {

  /**
   * Função utilizada apenas para validação da solução do desafio.
   *
   * @param args Não utilizado.
   * @throws IOException Caso ocorra algum problema ao ler os arquivos de entrada ou gravar os
   *     arquivos de saída.
   */
  public static void main(String[] args) throws IOException {
    File pastaDeEntradas = new File("./entradas/");
    File pastaDeSaidas = new File("./saidas/");
    new Conversor().converterPasta(pastaDeEntradas, pastaDeSaidas);
  }

  /**
   * Converte todos os arquivos CSV da pasta de entradas. Os resultados são gerados na pasta de
   * saídas, deixando os arquivos originais inalterados.
   *
   * @param pastaDeEntradas Pasta contendo os arquivos CSV gerados pela página web.
   * @param pastaDeSaidas Pasta em que serão colocados os arquivos gerados no formato requerido pelo
   *     subsistema.
   * @throws IOException Caso ocorra algum problema ao ler os arquivos de entrada ou gravar os
   *     arquivos de saída.
   */
  public void converterPasta(File pastaDeEntradas, File pastaDeSaidas) throws IOException {
    lerArquivo(pastaDeEntradas, pastaDeSaidas);
  }

  /** Ler arquivo. */
  public void lerArquivo(File pastaDeEntradas, File pastaDeSaidas) throws IOException {
    if (!pastaDeSaidas.isDirectory()) {
      pastaDeSaidas.mkdir();
    }
    for (File pasta : pastaDeEntradas.listFiles()) {
      FileReader leitorArquivo = new FileReader(pasta);
      BufferedReader bufferedLeitor = new BufferedReader(leitorArquivo);
      FileWriter escritorArquivo = new FileWriter(pastaDeSaidas + "/" + pasta.getName());
      BufferedWriter bufferedEscritor = new BufferedWriter(escritorArquivo);

      String conteudoLinha = bufferedLeitor.readLine();
      bufferedEscritor.write(conteudoLinha);
      bufferedEscritor.newLine();
      bufferedEscritor.flush();
      conteudoLinha = bufferedLeitor.readLine();

      while (conteudoLinha != null) {
        bufferedEscritor.write(formatador(conteudoLinha));
        bufferedEscritor.newLine();
        bufferedEscritor.flush();
        conteudoLinha = bufferedLeitor.readLine();
      }
      escritorArquivo.close();
      bufferedEscritor.close();
    }
  }

  /** Formatador. */
  public String formatador(String texto) {
    String[] resultado = texto.split(",");
    String[] data = resultado[1].split("/");
    resultado[0] = resultado[0].toUpperCase();
    resultado[1] = data[2] + "-" + data[1] + "-" + data[0];
    resultado[3] =
        resultado[3].substring(0, 3)
            + "."
            + resultado[3].substring(3, 6)
            + "."
            + resultado[3].substring(6, 9)
            + "-"
            + resultado[3].substring(9, 11);
    return String.join(",", resultado);
  }
}
