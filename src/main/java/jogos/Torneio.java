package jogos;

import model.Jogador;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Torneio {
    private String nome;
    private ArrayList<Jogador> jogadores;
    private Random random;

    public Torneio(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
        this.random = new Random();
    }

    public void adicionarJogador(Jogador jogador) {
        if (!jogadores.contains(jogador)) {
            jogadores.add(jogador);
        }
    }

    public void simularTorneio() {
        for (Jogador jogador : jogadores) {
            int pontos = 100 + random.nextInt(401);
            jogador.adicionarPontuacao(pontos);
        }
    }

    public void exibirResultado() {
        this.jogadores.sort(Comparator.comparingInt(Jogador::getPontuacao).reversed());

        StringBuilder resultado = new StringBuilder("\n== RESULTADO DO TORNEIO: " + nome + " ==\n");
        for (int i = 0; i < jogadores.size(); i++) {
            resultado.append((i + 1)).append(" - ").append(jogadores.get(i)).append("\n");
        }
        resultado.append("\nVENCEDOR: ").append(jogadores.get(0));

        System.out.println(resultado);
    }
}


