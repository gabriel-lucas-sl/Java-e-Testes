package br.com.caelum.leilao.teste;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;
import br.com.caelum.leilao.service.Avaliador;
import org.junit.Assert;
import org.junit.Test;

public class TesteAvaliador {

  @Test
  public void deveEntenderLancesEmOrdemCrescente() {
    // cenário
    Usuario joao = new Usuario("João");
    Usuario jose = new Usuario("José");
    Usuario maria = new Usuario("Maria");

    Leilao leilao = new Leilao("Playstation 3");
    leilao.propoe(new Lance(joao, 250.0));
    leilao.propoe(new Lance(jose, 300.0));
    leilao.propoe(new Lance(maria, 400.0));

    // ação
    Avaliador leiloeiro = new Avaliador();
    leiloeiro.avalia(leilao);

    // retorno do método/validação
    double maiorEsperado = 400;
    double menorEsperado = 250;

    Assert.assertEquals(maiorEsperado, leiloeiro.getMaiorDeTodos(), 0.00001);
    Assert.assertEquals(menorEsperado, leiloeiro.getMenorDeTodos(), 0.00001);
  }

}
