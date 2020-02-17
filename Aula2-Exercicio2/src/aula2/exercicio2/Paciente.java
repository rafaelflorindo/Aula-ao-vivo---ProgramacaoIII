package aula2.exercicio2;
public class Paciente {
    private String nome;

    public Paciente(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nome=" + nome + '}';
    }
}
