package com.trybe.acc.java.jogodasfazendas;

public abstract class Polygon implements Farm {
  private double base;
  private double height;

  public Polygon(double base, double height) {
    this.base = base;
    this.height = height;
  }

  public double getBase() {
    return base;
  }

  public double getHeight() {
    return height;
  }
}
