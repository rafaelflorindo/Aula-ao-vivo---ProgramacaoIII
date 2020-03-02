package aula4agregacao2;
public class Jogo {
  private String nome;
    private Pessoa jogador1, jogador2;

    public String getNome() {
        return nome;
    }
    public Pessoa getJogador1() {
        return jogador1;
    }
    public Pessoa getJogador2() {
        return jogador2;
    }

    public Jogo(String jogo, Pessoa desafiante, Pessoa desafiado) {
        this.nome = jogo;
        this.jogador1 = desafiante;
        this.jogador2 = desafiado;
    }

    @Override
    public String toString() {
        return "Jogo = " + nome + "\nDesafiante = " + jogador1.getNome() + ""
                + "\nDesafiado = " + jogador2.getNome();
    }
}
