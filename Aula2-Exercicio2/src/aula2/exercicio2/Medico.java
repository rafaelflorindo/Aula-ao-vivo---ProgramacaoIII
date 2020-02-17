package aula2.exercicio2;
public class Medico {
    private String nome;

    public Medico(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Medico{" + "nome=" + nome + '}';
    }
}
