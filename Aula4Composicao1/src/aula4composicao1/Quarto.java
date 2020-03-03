package aula4composicao1;
public class Quarto {
    public int numero;
    @Override
    public String toString() {
        return "Quarto{" + "numero=" + numero + '}';
    }

    public Quarto(int numero) {
        this.numero = numero;
    }  
}
