package com.trybe.acc.java.controledeacesso;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

  /** Método principal. */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    boolean menu = true;
    ArrayList<Short> ages = new ArrayList<>();
    do {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Acessar o estabelecimento");
      System.out.println("2 - Finalizar sistema e mostrar relatório");
      short input = scan.nextShort();
      if (input == 1) {
        System.out.println("Entre com a sua idade:");
        short age = scan.nextShort();
        if (age < 18) {
          System.out.println("Pessoa cliente menor de idade, catraca liberada!");
        } else if (age >= 18 && age < 50) {
          System.out.println("Pessoa adulta, catraca liberada!");
        } else {
          System.out.println("Pessoa adulta maior de 50, catraca liberada!");
        }
        ages.add(age);
      } else if (input == 2) {
        menu = false;
        report(ages);
      } else {
        System.out.println("Entre com uma opção válida");
      }
    } while (menu == true);
    scan.close();
  }

  private static void report(ArrayList<Short> ages) {
    final int total = ages.size();
    int child = 0;
    int adult = 0;
    int old = 0;
    for (int i : ages) {
      if (i < 18) {
        child += 1;
      } else if (i >= 18 && i < 50) {
        adult += 1;
      } else {
        old += 1;
      }
    }

    System.out.println("----- Quantidade -----");
    System.out.println("menores: " + child);
    System.out.println("adultas: " + adult);
    System.out.println("maiores que 50: " + old);

    System.out.println("");

    System.out.println("----- Percentual -----");
    System.out.println("menores: " + percentCalc(child, total) + "%");
    System.out.println("adultas: " + percentCalc(adult, total) + "%");
    System.out.println("maiores que 50: " + percentCalc(old, total) + "%");

    System.out.println("");

    System.out.println("TOTAL: " + total);
  }

  private static String percentCalc(int value, int total) {
    DecimalFormat df = new DecimalFormat("0.0#", new DecimalFormatSymbols(Locale.US));
    if (total > 0) {
      return df.format(((double) value / total) * 100);
    } else {
      return "0";
    }
  }
}
