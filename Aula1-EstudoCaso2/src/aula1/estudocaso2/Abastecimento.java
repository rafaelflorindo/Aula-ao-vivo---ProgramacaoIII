package aula1.estudocaso2;
public class Abastecimento {
    private String dataAbastecimento;
    private double qtdLitro;
    private double precoLitro;
    private int kmAtual;

    public Abastecimento(String dataAbastecimento, double qtdLitro, double precoLitro, int kmAtual) {
        this.dataAbastecimento = dataAbastecimento;
        this.qtdLitro = qtdLitro;
        this.precoLitro = precoLitro;
        this.kmAtual = kmAtual;
    }

    @Override
    public String toString() {
        return "Abastecimento{" + "dataAbastecimento=" + dataAbastecimento + ", qtdLitro=" + qtdLitro + ", precoLitro=" + precoLitro + ", kmAtual=" + kmAtual + '}';
    }


}
