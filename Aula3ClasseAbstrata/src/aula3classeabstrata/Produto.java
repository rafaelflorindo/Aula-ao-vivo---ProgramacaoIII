package aula3classeabstrata;
public abstract class Produto {
    protected String nome;
    protected double preco;
    
    public abstract double menorPreco();
    public abstract double maiorPreco();
    
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    @Override
    public String toString() {
        return "Titulo = " + nome + ", \nPreço= R$ " + preco;
    }
}
