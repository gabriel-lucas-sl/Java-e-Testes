package br.com.caelum.leilao.service;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import java.util.ArrayList;
import java.util.List;

public class Avaliador {

  private double maiorDeTodos = Double.NEGATIVE_INFINITY; // constante que guarda o menor número dentro do Double

  private double menorDeTodos = Double.POSITIVE_INFINITY;

  public void avalia(Leilao leilao) {
    for (Lance lance: leilao.getLances()) {
      if (lance.getValor() > maiorDeTodos) maiorDeTodos = lance.getValor();
      if (lance.getValor() < menorDeTodos) menorDeTodos = lance.getValor();
    }
  }

  public double mediaDosLances(Leilao leilao) {
    List<Double> lances = new ArrayList<>();
    double aux = 0;
    for (Lance lance: leilao.getLances()) {
      aux = aux + lance.getValor();
      lances.add(lance.getValor());
    }
    return aux/lances.size();
  }

  public double getMaiorDeTodos() {
    return maiorDeTodos;
  }

  public double getMenorDeTodos() {
    return menorDeTodos;
  }

}
