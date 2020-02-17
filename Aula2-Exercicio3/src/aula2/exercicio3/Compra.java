package aula2.exercicio3;
public class Compra {
    private Cliente cliente;
    private double valor;

    public Compra(Cliente cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Compra{" + "cliente=" + cliente + ", valor=" + valor + '}';
    }   
}
