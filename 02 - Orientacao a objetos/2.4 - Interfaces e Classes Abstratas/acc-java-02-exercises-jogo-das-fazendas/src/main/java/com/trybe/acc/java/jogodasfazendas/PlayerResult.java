package com.trybe.acc.java.jogodasfazendas;

public class PlayerResult {
  private String playerName;
  private Farm[] farms;

  public PlayerResult(String name, Farm[] farms) {
    this.playerName = name;
    this.farms = farms;
  }

  /** PLayer Result. */
  public double score() {
    double result = 0;
    for (Farm farm : farms) {
      result += farm.area();
    }
    return result;
  }
}
