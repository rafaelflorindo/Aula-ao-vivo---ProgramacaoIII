package aula4composicao1;
public class Hotel {
    public Quarto qt;
    private String designacao;
    private String cidade;
    private String categoria;
    
    
    public Hotel(Quarto qt) {
        this.qt = qt;
    }
//http://www.caelum.com.br/download/caelum-java-objetos-fj11.pdf
    @Override
    public String toString() {
        return "Hotel{" + "qt=" + qt + '}';
    }
    
    public void matarQuarto(){
        this.qt = null;
    }
}
