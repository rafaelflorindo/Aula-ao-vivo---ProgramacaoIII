package aula3heranca1;
public class Apartamento extends Imovel {
    private double valorCondominio;
    public double getValorCondominio() {
        return valorCondominio;
    }
    public void setValorCondominio(double valorCondominio) {
        this.valorCondominio = valorCondominio;
    }
    @Override
    public String toString() {
        return "Apartamento{" + "valorCondominio=" + valorCondominio + '}';
    }
}
