package aula2.exercicio4;
public class Produto {
    private String nome;

    public Produto(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + '}';
    }
}
