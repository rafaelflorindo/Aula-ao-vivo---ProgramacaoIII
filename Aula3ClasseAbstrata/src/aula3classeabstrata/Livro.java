package aula3classeabstrata;
public class Livro extends Produto{
    private String autor;
    private int numPaginas;
    public Livro(String autor, int numPaginas, String nome, double preco) {
        super(nome, preco);
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
    @Override
    public String toString() {
        return "Livro: \n"+ super.toString() + "\nAutor = " + autor + ", "
                + "\nnúmeros de Paginas=" + numPaginas;
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