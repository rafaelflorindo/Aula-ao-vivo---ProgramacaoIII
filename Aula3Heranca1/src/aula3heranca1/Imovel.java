package aula3heranca1;
public class Imovel {
    protected String endereco, cidade;
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    } 
    @Override
    public String toString() {
        return "Imovel{" + "endereco=" + endereco + ", cidade=" + cidade + '}';
    }
}
