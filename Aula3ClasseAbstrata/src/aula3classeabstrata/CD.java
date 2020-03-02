package aula3classeabstrata;
public class CD  extends Produto{
    private String artista;
    private int numFaixas;

    public CD(String artista, int numFaixas, String nome, double preco) {
        super(nome, preco);
        this.artista = artista;
        this.numFaixas = numFaixas;
    }

    @Override
    public String toString() {
        return "CD\n" + super.toString() + "\nArtista = " + artista + "\nNúmero de Faixas = " + numFaixas;
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
