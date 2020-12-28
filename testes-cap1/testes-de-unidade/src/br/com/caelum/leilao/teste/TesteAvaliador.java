package br.com.caelum.leilao.teste;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;
import br.com.caelum.leilao.service.Avaliador;

public class TesteAvaliador {

  public static void main(String[] args) {
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
    System.out.println(leiloeiro.getMaiorDeTodos() + "\n" + leiloeiro.getMenorDeTodos());
  }

}
