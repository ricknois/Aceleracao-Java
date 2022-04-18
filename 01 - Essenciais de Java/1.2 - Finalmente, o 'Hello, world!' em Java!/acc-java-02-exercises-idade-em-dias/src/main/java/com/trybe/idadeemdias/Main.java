package com.trybe.idadeemdias;

import java.util.Scanner;

public class Main {
  /** Retorna o numero de dias que a pessoa viveu. */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Qual é o seu nome?");
    final String name = scan.next();
    System.out.println("Qual é sua idade em anos, meses e dias?");
    System.out.println("anos:");
    final int years = scan.nextInt();
    System.out.println("meses:");
    int months = scan.nextInt();
    System.out.println("dias:");
    int days = scan.nextInt();
    int result = Pessoa.calcularIdadeEmDias(years, months, days);
    System.out.println("Olá " + name + ", sua idade em dias é " + result);
    scan.close();
  }
}
