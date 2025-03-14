package main;

import jogos.Ranking;
import jogos.Torneio;
import model.Jogador;

public class Main {
    public static void main(String[] args) {

        Ranking ranking = new Ranking();

        Jogador jogador1 = new Jogador("Maria", (int) (Math.random() * 1000));
        Jogador jogador2 = new Jogador("João", (int) (Math.random() * 1000));
        Jogador jogador3 = new Jogador("José", (int) (Math.random() * 1000));

        System.out.println(jogador1);
        System.out.println(jogador2);
        System.out.println(jogador3);

        ranking.adicionarJogador(jogador1);
        ranking.adicionarJogador(jogador2);
        ranking.adicionarJogador(jogador3);

        ranking.exibirRanking();


        Torneio torneio1 = new Torneio("Torneio de Verão");
        torneio1.adicionarJogador(new Jogador("Maria", 0));
        torneio1.adicionarJogador(new Jogador("João", 0));
        torneio1.adicionarJogador(new Jogador("José", 0));

        torneio1.simularTorneio();
        torneio1.exibirResultado();

        Torneio torneio2 = new Torneio("Torneio de Inverno");
        torneio2.adicionarJogador(new Jogador("Ana", 0));
        torneio2.adicionarJogador(new Jogador("Carlos", 0));
        torneio2.adicionarJogador(new Jogador("Fernanda", 0));
        torneio2.adicionarJogador(new Jogador("Lucas", 0));

        torneio2.simularTorneio();
        torneio2.exibirResultado();
    }

}
