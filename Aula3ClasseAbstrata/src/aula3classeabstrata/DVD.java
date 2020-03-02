package aula3classeabstrata;
public class DVD  extends Produto{
    private String artista;
    private int duracao;

    public DVD(String artista, int duracao, String nome, double preco) {
        super(nome, preco);
        this.artista = artista;
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "DVD\n" + super.toString() + "\nArtista=" + artista + "\nDuracao=" + duracao;
    }
    
    
    @Override
    public double menorPreco() {
       return 0;
    }

    @Override
    public double maiorPreco() {
        return 0;
    }
    
}
