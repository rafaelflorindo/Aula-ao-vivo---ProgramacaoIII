package aula2.exercicio3;
public class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + '}';
    }   
}
