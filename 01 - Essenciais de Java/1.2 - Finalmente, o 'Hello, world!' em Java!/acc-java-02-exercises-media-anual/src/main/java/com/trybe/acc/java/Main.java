package com.trybe.acc.java;

import java.util.Scanner;

public class Main {
  /** Retorna média do usuário. */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Qual é o seu nome?");
    String name = scan.next();
    System.out.println("Entre com as notas das provas:");
    System.out.println("Avaliação 1:");
    double grade1 = scan.nextDouble();
    System.out.println("Avaliação 2:");
    double grade2 = scan.nextDouble();
    System.out.println("Avaliação 3:");
    double grade3 = scan.nextDouble();
    System.out.println("Avaliação 4:");
    double grade4 = scan.nextDouble();
    double result = Nota.calcularMedia(grade1, grade2, grade3, grade4);

    System.out.println("Olá, " + name + ", sua média é " + result);
    scan.close();
  }
}
